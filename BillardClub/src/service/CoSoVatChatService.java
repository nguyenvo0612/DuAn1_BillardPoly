package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.CoSoVatChat;
import repository.CoSoVatChatRepository;
import utility.DBContext;

public class CoSoVatChatService {
private CoSoVatChatRepository coSoVatChatRepository =new CoSoVatChatRepository();
    public List<CoSoVatChat> getAll() {
        return coSoVatChatRepository.getAll();
    }

    public int createCoSoVatChatRepository(CoSoVatChat csvc) {
        return coSoVatChatRepository.createCoSoVatChatRepository(csvc);
    }

    public int updateCoSoVatChatRepository(CoSoVatChat csvc) {
        return coSoVatChatRepository.updateCoSoVatChatRepository(csvc);
    }

    public int deleteCoSoVatChatRepository(CoSoVatChat csvc) {
        return coSoVatChatRepository.deleteCoSoVatChatRepository(csvc);
    }
}
