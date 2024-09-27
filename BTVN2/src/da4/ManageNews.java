package da4;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageNews {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<News> newsList = new ArrayList<>();  // Danh sách lưu các đối tượng News
        int choice;

        do {
            System.out.println("NEWS MANAGEMENT SYSTEM");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();  // Đọc bỏ ký tự thừa sau khi nhập số

            switch (choice) {
                case 1:
                    // Thêm tin tức
                    News news = new News();
                    System.out.print("Enter title: ");
                    news.setTitle(sc.nextLine());

                    System.out.print("Enter publish date: ");
                    news.setPublishDate(sc.nextLine());

                    System.out.print("Enter author: ");
                    news.setAuthor(sc.nextLine());

                    System.out.print("Enter content: ");
                    news.setContent(sc.nextLine());

                    // Nhập 3 đánh giá và lưu vào RateList
                    int[] rates = new int[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Enter rate " + (i + 1) + ": ");
                        rates[i] = sc.nextInt();
                    }
                    news.setRateList(rates);

                    // Thêm đối tượng news vào danh sách
                    newsList.add(news);
                    break;

                case 2:
                    // Hiển thị danh sách các tin tức
                    for (News n : newsList) {
                        n.Display();
                        System.out.println();
                    }
                    break;

                case 3:
                    // Hiển thị danh sách các tin tức và tính trung bình đánh giá
                    for (News n : newsList) {
                        n.Calculate();
                        n.Display();
                        System.out.println();
                    }
                    break;

                case 4:
                    // Thoát chương trình
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 4);

        sc.close();
	}
}
