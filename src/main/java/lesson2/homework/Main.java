package lesson2.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InitializationData initializationData = new InitializationData();
        Information information = initializationData.fillLists();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(78);
        arrayList.add(3);
        arrayList.add(8);

        Information newInformation = newDopStrings(arrayList, information);

        System.out.println("Email set size: " + newInformation.getEmailUserSet().size());
        System.out.println("Email and Nickname map size: " + newInformation.getNicknameAndEmailMap().size());
        System.out.println("Nickname list size " + newInformation.getNicknameUserList().size());
    }
    public static Information newDopStrings(List<? extends Number> numberList, Information info) {

        List<String> newNicknameList = info.getNicknameUserList();
        Set<String> newEmailSet = info.getEmailUserSet();
        Map<String, String> newNicknameAndEmailMap = info.getNicknameAndEmailMap();

        for (int i = 0; i < numberList.size(); i++) {
            String nickname = String.valueOf(numberList.get(i));

            newNicknameList.add(nickname);
            newEmailSet.add(nickname + "@mail.ua");
            newNicknameAndEmailMap.put(nickname + "@mail.ua", nickname);
        }

        Set<String> nicknameSet = new HashSet<>(newNicknameList);
        newNicknameList.clear();
        nicknameSet.addAll(newNicknameList);
        newNicknameList.addAll(nicknameSet);

        info.setNicknameUserList(newNicknameList);
        info.setEmailUserSet(newEmailSet);
        info.setNicknameAndEmailMap(newNicknameAndEmailMap);
        return info;
    }
}
