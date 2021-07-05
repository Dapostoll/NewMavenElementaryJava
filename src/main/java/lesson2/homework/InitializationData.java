package lesson2.homework;

import java.util.*;

public class InitializationData {

    private Information  information;

    public InitializationData(){
        information = new Information();
    }

    public Information fillLists(){

        List<String> nicknames = new ArrayList<>();

        Set<String> emails = new HashSet<>();

        Map<String, String> emailAndNicknameMap = new HashMap<>();

        String emailFill = "aboba@gmail.com";
        String nicknameFill = "aboba";

        for (int i = 0; i < 10; i++) {
            nicknames.add(nicknameFill);
            emails.add(emailFill);
            emailAndNicknameMap.put(emailFill,nicknameFill);
        }
        emailAndNicknameMap.putAll(fillEmailAndNicknameMap());
        nicknames.addAll(emailAndNicknameMap.values());
        emails.addAll(emailAndNicknameMap.keySet());

        information.setNicknameUserList(nicknames);
        information.setEmailUserSet(emails);
        information.setNicknameAndEmailMap(emailAndNicknameMap);

        if (checkSizeEquality(information) == false) {
            correctListSize(information.getNicknameUserList());
        }
        return information;


    }
    public Map<String,String> fillEmailAndNicknameMap() {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 30; i++) {
            map.put("undegorundAboba" + i + "@gmail.com", "undegroundAboba" + i);
        }
        return map;
    }
    private List<String> correctListSize(List<String> list) {
        Set<String> nicknameSet = new HashSet<>(list);
        list.clear();
        list.addAll(nicknameSet);
        return list;
    }
    private boolean checkSizeEquality(Information info) {
        if (info.getNicknameUserList().size() == info.getEmailUserSet().size()
                && info.getEmailUserSet().size() == info.getNicknameAndEmailMap().size()) {
            return true;
        }
        return false;
    }

}
