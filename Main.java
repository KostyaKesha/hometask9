package hometask9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<String>();
        // ���� ��� ������
        cats.add("Barsik");
        cats.add("Murzik");
        cats.add("Matroskin");

        System.out.println(cats.size());
            System.out.println("-----------------");
            System.out.println("  ");
            for (int i = 0; i < cats.size(); i++)
            {
                System.out.println(cats.get(i));
            }
            cats.set(0, "Pushok"); //������ ��� ���� ����� � ��� ������ � �����, ����� �����
        System.out.println(" ");
        System.out.println("*****");

            for (int i = 0; i < cats.size(); i++)
        {
            System.out.println(cats.get(i));
        }
        cats.remove(1); // � ����! ������ ����!!!
        System.out.println(" ");
        System.out.println("*****");

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
            System.out.println("---------------------");
        System.out.println("  ");
    }
}