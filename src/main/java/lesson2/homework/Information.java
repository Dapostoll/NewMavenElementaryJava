package lesson2.homework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {
    private List<String> nicknameUserList;
    private Set<String> emailUserSet;
    private Map<String,String> nicknameAndEmailMap;

    public List<String> getNicknameUserList() {
        return nicknameUserList;
    }

    public void setNicknameUserList(List<String> nicknameUserList) {
        this.nicknameUserList = nicknameUserList;
    }

    public Set<String> getEmailUserSet() {
        return emailUserSet;
    }

    public void setEmailUserSet(Set<String> emailUserSet) {
        this.emailUserSet = emailUserSet;
    }

    public Map<String, String> getNicknameAndEmailMap() {
        return nicknameAndEmailMap;
    }

    public void setNicknameAndEmailMap(Map<String, String> nicknameAndEmailMap) {
        this.nicknameAndEmailMap = nicknameAndEmailMap;
    }

    @Override
    public String toString() {
        return "Information{" +
                "nicknameUserList=" + nicknameUserList +
                ", emailUserSet=" + emailUserSet +
                ", nicknameAndEmailMap=" + nicknameAndEmailMap +
                '}';
    }
}
