/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.BanChoi;
import repository.BanChoiRepository;

/**
 *
 * @author acer
 */
public class BanChoiService {
    private BanChoiRepository repo = new BanChoiRepository();
    public List<BanChoi> getAll() {
        return repo.getAll();
    }
    
    public int CreateBanChoi(BanChoi bc) {
        return repo.createCoSoVatChatRepository(bc);
    }
    //asdasd
    public int getIDBanChoi(String maBan) {
        for (BanChoi bc : repo.getAll()) {
            if(bc.getMaBan().contains(maBan)) {
                return bc.getId();
            }
        }
        return 0;
    }
}
