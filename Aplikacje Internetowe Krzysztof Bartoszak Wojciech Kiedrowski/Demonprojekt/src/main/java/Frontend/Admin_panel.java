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

    VerticalLayout layout1 = new VerticalLayout();
    VerticalLayout layout2 = new VerticalLayout();
    VerticalLayout layout3 = new VerticalLayout();
    VerticalLayout layout4 = new VerticalLayout();
    VerticalLayout layout5 = new VerticalLayout();
    VerticalLayout layout6 = new VerticalLayout();


    Button deleteUserButton = new Button("Usuwanie uzytkownika");

    TextField userNameTF = new TextField("Podaj id uzytkownika: ");

    Button deletingDelegationButton = new Button("Usuwanie delegacji");

    TextField userIdTF = new TextField("Podaj id uzytkownika: ");
    TextField delegationIdTF = new TextField("Podaj id delegacji: ");

    Button delegationEditButton = new Button("Edycja delegacji");

    TextField delegationIdTF_1 = new TextField("Podaj id delegacji");
    TextField delegationStartTimeTF = new TextField("Podaj Czas rozpoczecia: ");
    TextField delegationEndTimeTF = new TextField("Podaj czas zakonczenia: ");
    TextField delegationDietTF = new TextField("Podaj diete: ");
    TextField breakfastCountTF = new TextField("Podaj ilosc sniadan: ");
    TextField dinnerCountTF = new TextField("Podaj ilosc obiadow: ");
    TextField supperCountTF = new TextField("Podaj ilosc kolacji: ");
    TextField transportTypeTF = new TextField("Podaj rodzaj transportu: ");
    TextField ticketPriceTF = new TextField("Podaj ceny biletow: ");
    TextField quaterPriceTF = new TextField("Podaj cene zakwaterowania: ");
    TextField otherTicketsTF = new TextField("Podaj innych biletow: ");

    Button adminRightsAssignmentButton = new Button("Przypisanie uprawnien administratora");

    TextField userIdTF_2 = new TextField("Podaj id uzytkownika: ");

    Button confirmDelegationButton = new Button("Potwierdzenie delegacji");

    TextField userNameTF_2 = new TextField("Podaj nazwe uzytkownika: ");
    TextField delegationNameTF = new TextField("Podaj nazwe delegacji: ");

    Button cancelDelegationButton = new Button("Cofniecie delegacji");

    TextField userNameTF_3 = new TextField("Podaj nazwe uzytkownika: ");
    TextField delegationName_3 = new TextField("Podaj nazwe delegacji: ");

    deleteUserButton.addClickListener(clickEvent -> {
        String ladnie = userNameTF.getText();
        Controller C = new Controller();
        int i = Integer.valueOf(ladnie);
        C.deleteUserById(i);
    });

    deletingDelegationButton.addClickListener(clickEvent -> {
        String ladnie = userIdTF.getText();
        String brzydko = delegationIdTF.getText();
        Controller C = new Controller();
        int k = Integer.valueOf(brzydko);
        int j = Integer.valueOf(ladnie);
        C.removeDelegation(j, k);
    });

    delegationEditButton.addClickListener(clickEvent -> {
        String ladnie = delegationIdTF_1.getText();
        Delegation brzydko = new Delegation(delegationStartTimeTF.getText(), delegationEndTimeTF.getText(), delegationDietTF.getText(), breakfastCountTF.getText(), dinnerCountTF.getText(), supperCountTF.getText(), transportTypeTF.getText(), ticketPriceTF.getText(), quaterPriceTF.getText(), otherTicketsTF.getText());
        Controller C = new Controller();
        int j = Integer.valueOf(ladnie);
        C.changeDelegation(j, brzydko);
    });

    adminRightsAssignmentButton.addClickListener(clickEvent -> {
        String ladnie = userIdTF_2.getText();
        Controller C = new Controller();
        int i = Integer.valueOf(ladnie);
        C.deleteUserById(i);
    });

    confirmDelegationButton.addClickListener(clickEvent -> {
        String ladnie = userNameTF_2.getText();
        String brzydko = delegationNameTF.getText();
        Controller C = new Controller();
        int k = Integer.valueOf(brzydko);
        int j = Integer.valueOf(ladnie);
        C.removeDelegation(j, k);
    });

    layout1.addComponent(deleteUserButton);
    layout1.addComponent(userNameTF);
    layout1.setHigh(12.5%);

    layout2.addComponent(deletingDelegationButton);
    layout2.addComponent(userIdTF);
    layout2.addComponent(delegationIdTF);
    layout2.setHigh(15%);

    layout3.addComponent(delegationEditButton);
    layout3.addComponent(delegationStartTimeTF);
    layout3.addComponent(delegationEndTimeTF);
    layout3.addComponent(delegationDietTF);
    layout3.addComponent(breakfastCountTF);
    layout3.addComponent(dinnerCountTF);
    layout3.addComponent(supperCountTF);
    layout3.addComponent(transportTypeTF);
    layout3.addComponent(ticketPriceTF);
    layout3.addComponent(quaterPriceTF);
    layout3.addComponent(otherTicketsTF);
    layout3.setHigh(30%);

    layout4.addComponent(adminRightsAssignmentButton);
    layout4.addComponent(userIdTF_2);
    layout4.setHigh(12.5%);

    layout5.addComponent(confirmDelegationButton);
    layout5.addComponent(userNameTF_2);
    layout5.addComponent(delegationNameTF);
    layout5.setHigh(15%);

    layout6.addComponent(cancelDelegationButton);
    layout6.addComponent(userNameTF_3);
    layout6.addComponent(delegationName_3);
    layout6.setHigh(15%);

    public Admin_panel() {
        add(new Text("Welcome to MainView."));
    }

}