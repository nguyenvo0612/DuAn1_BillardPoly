/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.ChiTietBanChoi;
import repository.ChiTietBanChoiRepository;

/**
 *
 * @author acer
 */
public class ChiTietBanChoiService {
    private ChiTietBanChoiRepository repo = new ChiTietBanChoiRepository();
    public int createChiTietBanChoi(ChiTietBanChoi ctb) {
        return repo.createCoSoVatChatRepository(ctb);
    }
}
