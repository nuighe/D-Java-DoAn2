/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import BUS.BusAccessor.SanPhamBUS;
import DTO.ChiTietHoaDon;
import DTO.SanPham;
import GUI.SaleGroup.SellerGUI.BasicHandle.ChangePaymentInfo;
import GUI.SaleGroup.SellerGUI.BasicHandle.RemoveOrderItemAction;
import GUI.SaleGroup.SellerGUI.BasicHandle.SpinQuantityAction;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author huykh
 */
public class OrderPanel extends ScrollPanel{
    private final ChangePaymentInfo changePayment;
    private final JButton bnThanhToan;
        
    public OrderPanel(int width, int height, ChangePaymentInfo changePayment, JButton bnThanhToan){
        super(width, height);
        this.changePayment = changePayment;
        this.bnThanhToan = bnThanhToan;
    }
    
    public JButton getBnThanhToan(){
        return bnThanhToan;
    }
    
    public void addToPanel(SanPham sp) {
        OrderItem item = new OrderItem(sp);
        item.getButtonRemove().addActionListener(new RemoveOrderItemAction(item, this));
        item.getJTextFieldQuantity().getDocument().addDocumentListener(new SpinQuantityAction(item, this));
        this.panel.add(item);
        this.panel.revalidate();
        this.panel.repaint();
//        System.out.println("Calculate height");
        this.panel.setPreferredSize(new Dimension((int)this.panel.getPreferredSize().getWidth(),calculateHeight()));
    }

    public void addToPanel(List<SanPham> list) {
        for (SanPham sp: list){
            addToPanel(sp);
        }
    }

    public List<SanPham> getListData() {
        return new ArrayList<>();
    }
    
    public List<ChiTietHoaDon> getListChiTietHoaDon(int maHD){
        List<ChiTietHoaDon> listCTHD = new ArrayList<>();
        Component[] list = this.panel.getComponents();
        for (Component item : list){
            if (item instanceof OrderItem orderitem){
                listCTHD.add(orderitem.getChiTietHoaDon(maHD));
            }
        }
        return listCTHD;
    }
    
    public OrderItem getOrderItem(int maSP){
        Component[] list = this.panel.getComponents();
        for (Component item : list){
            if (item instanceof OrderItem orderitem){
                if (orderitem.getMaSP() == maSP){
                    return orderitem;
                } 
            }
        }
        return null;
    }
    
//    public boolean removeOrderItemHasProductId(int maSP){
//        OrderItem orderitem = getOrderItem(maSP);
//        if (orderitem == null){
//            return false;
//        }
//        this.panel.remove(orderitem);
//        this.revalidate();
//        this.repaint();
//        return true;
//    }
    
    public boolean removeOrderItem(OrderItem orderItem){
        if (orderItem == null){
            return false;
        }
        this.panel.remove(orderItem);
        this.revalidate();
        this.repaint();
        this.panel.setPreferredSize(new Dimension((int)this.panel.getPreferredSize().getWidth(),calculateHeight()));
        this.calculatePayment();
        return true;
    }
    
    
    public boolean removeAllOrderItem(){
        if(this.panel.getComponents().length != 0){
            this.panel.removeAll();
            this.revalidate();
            this.repaint();
            this.panel.setPreferredSize(new Dimension((int)this.panel.getPreferredSize().getWidth(),calculateHeight()));
            this.calculatePayment();
            return true;
        }
        return false;
    }
    
    public void addOrderItemOrIncrementByOne(SanPham sp){
        OrderItem orderitem = getOrderItem(sp.getMaSP());
        if (orderitem == null){
            this.addToPanel(sp);   
        }else{
            SanPhamBUS sanphamBus = new SanPhamBUS();
            if(sanphamBus.get(sp.getMaSP()).getSoLuong() >= (orderitem.getQuantity() + 1L)){
                orderitem.changeQuantity(orderitem.getQuantity()+1L);
            }else JOptionPane.showMessageDialog(this, "Số lượng không đủ!", "Chú ý", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        
        this.calculatePayment();
    }
    
    
    public void calculatePayment(){
        this.changePayment.calculatePayment(getListChiTietHoaDon(0));
    }
    
    public void checkButtonThanhToan(){
        if(this.panel.getComponentCount() == 0)
            this.bnThanhToan.setEnabled(false);
    }
}
