package Frontend;

import Tables.Delegation;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import controller.Controller;

import java.awt.*;

@Route
public class Admin_panel extends VerticalLayout {

    VerticalLayout ljalt_1 = new VerticalLayout();
    VerticalLayout ljalt_2 = new VerticalLayout();
    VerticalLayout ljalt_3 = new VerticalLayout();
    VerticalLayout ljalt_4 = new VerticalLayout();
    VerticalLayout ljalt_5 = new VerticalLayout();
    VerticalLayout ljalt_6 = new VerticalLayout();


    Button usuwanie_u = new Button("Usuwanie uzytkownika");

    TextField nazwa_i = new TextField("Podaj id uzytkownika: ");

    Button usuwanie_d = new Button("Usuwanie delegacji");

    TextField nazwa_i_2 = new TextField("Podaj id uzytkownika: ");
    TextField nazwa_d = new TextField("Podaj id delegacji: ");

    Button edycja_d = new Button("Edycja delegacji");

    TextField nazwa_u0 = new TextField("Podaj id delegacji");
    TextField nazwa_u1 = new TextField("Podaj Czas rozpoczecia: ");
    TextField nazwa_u2 = new TextField("Podaj czas zakonczenia: ");
    TextField nazwa_u3 = new TextField("Podaj diete: ");
    TextField nazwa_u4 = new TextField("Podaj ilosc sniadan: ");
    TextField nazwa_u5 = new TextField("Podaj ilosc obiadow: ");
    TextField nazwa_u6 = new TextField("Podaj ilosc kolacji: ");
    TextField nazwa_u7 = new TextField("Podaj rodzaj transportu: ");
    TextField nazwa_u8 = new TextField("Podaj ceny biletow: ");
    TextField nazwa_u9 = new TextField("Podaj cene zakwaterowania: ");
    TextField nazwa_u10 = new TextField("Podaj innych biletow: ");

    Button przypisanie_u = new Button("Przypisanie uprawnien administratora");

    TextField nazwa_3 = new TextField("Podaj id uzytkownika: ");

    Button potwierdzenie_d = new Button("Potwierdzenie delegacji");

    TextField nazwa_u_4 = new TextField("Podaj nazwe uzytkownika: ");
    TextField nazwa_d_2 = new TextField("Podaj nazwe delegacji: ");

    Button cofanie_d = new Button("Cofniecie delegacji");

    TextField nazwa_u_5 = new TextField("Podaj nazwe uzytkownika: ");
    TextField nazwa_d_3 = new TextField("Podaj nazwe delegacji: ");

    usuwanie_u.addClickListener(clickEvent -> {
        String ladnie = nazwa_i.getText();
        Controller C = new Controller();
        int i = Integer.valueOf(ladnie);
        C.deleteUserById(i);
    });

    usuwanie_d.addClickListener(clickEvent -> {
        String ladnie = nazwa_i_2.getText();
        String brzydko = nazwa_d.getText();
        Controller C = new Controller();
        int k = Integer.valueOf(brzydko);
        int j = Integer.valueOf(ladnie);
        C.removeDelegation(j, k);
    });

    edycja_d.addClickListener(clickEvent -> {
        String ladnie = nazwa_u0.getText();
        Delegation brzydko = new Delegation(nazwa_u1.getText(), nazwa_u2.getText(), nazwa_u3.getText(), nazwa_u4.getText(), nazwa_u5.getText(), nazwa_u6.getText(), nazwa_u7.getText(), nazwa_u8.getText(), nazwa_u9.getText(), nazwa_u10.getText());
        Controller C = new Controller();
        int j = Integer.valueOf(ladnie);
        C.changeDelegation(j, brzydko);
    });

    przypisanie_u.addClickListener(clickEvent -> {
        String ladnie = nazwa_3.getText();
        Controller C = new Controller();
        int i = Integer.valueOf(ladnie);
        C.deleteUserById(i);
    });

    potwierdzenie_d.addClickListener(clickEvent -> {
        String ladnie = nazwa_u_4.getText();
        String brzydko = nazwa_d_2.getText();
        Controller C = new Controller();
        int k = Integer.valueOf(brzydko);
        int j = Integer.valueOf(ladnie);
        C.removeDelegation(j, k);
    });

    ljalt_1.addComponent(usuwanie_u);
    ljalt_1.addComponent(nazwa_i);
    ljalt_1.setHigh(12.5%);

    ljalt_2.addComponent(usuwanie_d);
    ljalt_2.addComponent(nazwa_i_2);
    ljalt_2.addComponent(nazwa_d);
    ljalt_2.setHigh(15%);

    ljalt_3.addComponent(edycja_d);
    ljalt_3.addComponent(nazwa_u1);
    ljalt_3.addComponent(nazwa_u2);
    ljalt_3.addComponent(nazwa_u3);
    ljalt_3.addComponent(nazwa_u4);
    ljalt_3.addComponent(nazwa_u5);
    ljalt_3.addComponent(nazwa_u6);
    ljalt_3.addComponent(nazwa_u7);
    ljalt_3.addComponent(nazwa_u8);
    ljalt_3.addComponent(nazwa_u9);
    ljalt_3.addComponent(nazwa_u10);
    ljalt_3.setHigh(30%);

    ljalt_4.addComponent(przypisanie_u);
    ljalt_4.addComponent(nazwa_3);
    ljalt_4.setHigh(12.5%);

    ljalt_5.addComponent(potwierdzenie_d);
    ljalt_5.addComponent(nazwa_u_4);
    ljalt_5.addComponent(nazwa_d_2);
    ljalt_5.setHigh(15%);

    ljalt_6.addComponent(cofanie_d);
    ljalt_6.addComponent(nazwa_u_5);
    ljalt_6.addComponent(nazwa_d_3);
    ljalt_6.setHigh(15%);

    public Admin_panel() {
        add(new Text("Welcome to MainView."));
    }

}