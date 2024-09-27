package da3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
	ArrayList<String> PhoneList = new ArrayList<String>();
	@Override
	void insertPhone(String name, String phone) {
		for (int i = 0; i < PhoneList.size(); i++) {
            String entry = PhoneList.get(i);
            if (entry.startsWith(name + ":")) {
                if (!entry.contains(phone)) {
                    PhoneList.set(i, entry + " : " + phone);
                }
                return;
            }
        }
        PhoneList.add(name + ": " + phone);
	}

	@Override
	void removePhone(String name) {
		for (int i = 0; i < PhoneList.size(); i++) {
            if (PhoneList.get(i).startsWith(name + ":")) {
                PhoneList.remove(i);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng có tên " + name);
	}

	@Override
	void updatePhone(String name, String newPhone) {
		for (int i = 0; i < PhoneList.size(); i++) {
            if (PhoneList.get(i).startsWith(name + ":")) {
                PhoneList.set(i, name + ": " + newPhone);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng có tên " + name);
	}

	@Override
	void searchPhone(String name) {
		for (String entry : PhoneList) {
            if (entry.startsWith(name + ":")) {
                System.out.println(entry);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng có tên " + name);
	}

	@Override
	void sort() {
		Collections.sort(PhoneList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split(":")[0].compareTo(o2.split(":")[0]);
            }
        });
        System.out.println("Danh sách đã được sắp xếp.");
	}

}
