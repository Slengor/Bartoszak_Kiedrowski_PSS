package com.example.demo;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route()
public class AdminPanel extends VerticalLayout {

	Button delUButton = new Button("usuwanie uzytkownika");
	Button delDeleBut = new Button("usuwanie delegacji");
	Button dEditB = new Button("Edycja delegacji");
    Button adRightsAssignmentBu = new Button("przypisanie uprawnien administratora");
    Button confDelB = new Button("potwierdzenie delegacji");
    Button cancelDelegationButton = new Button("cofniecie delegacji");
	
    VerticalLayout l1 = new VerticalLayout();
    VerticalLayout l2 = new VerticalLayout();
    VerticalLayout l3 = new VerticalLayout();
    VerticalLayout l4 = new VerticalLayout();
    VerticalLayout l5 = new VerticalLayout();
    VerticalLayout l6 = new VerticalLayout();

    TextField uNTF = new TextField("podaj id uzytkownika: ");
    TextField uIdTF = new TextField("podaj id uzytkownika: ");
    TextField delegationIdTF = new TextField("podaj id delegacji: ");
    TextField delegationIdTF_1 = new TextField("podaj id delegacji");
    TextField delegationStartTimeTF = new TextField("podaj Czas rozpoczecia: ");
    TextField delegationEndTimeTF = new TextField("podaj czas zakonczenia: ");
    TextField delegationDietTF = new TextField("podaj diete: ");
    TextField breakfastCountTF = new TextField("podaj ilosc sniadan: ");
    TextField dinnerCountTF = new TextField("podaj ilosc obiadow: ");
    TextField supperCountTF = new TextField("podaj ilosc kolacji: ");
    TextField transportTypeTF = new TextField("podaj rodzaj transportu: ");
    TextField ticketPriceTF = new TextField("podaj ceny biletow: ");
    TextField quaterPriceTF = new TextField("podaj cene zakwaterowania: ");
    TextField otherTicketsTF = new TextField("podaj innych biletow: ");
    TextField userIdTF_2 = new TextField("podaj id uzytkownika: ");
    TextField userNameTF_2 = new TextField("podaj nazwe uzytkownika: ");
    TextField delegationNameTF = new TextField("podaj nazwe delegacji: ");
    TextField userNameTF_3 = new TextField("podaj nazwe uzytkownika: ");
    TextField delegationName_3 = new TextField("podaj nazwe delegacji: ");

   

    

    public AdminPanel() {
	    confDelB.addClickListener(clickEvent -> {
	        String ladnie = userNameTF_2.getValue();
	        String brzydko = delegationNameTF.getValue();
	        RestCon C = new RestCon();
	        int k = Integer.valueOf(brzydko);
	        int j = Integer.valueOf(ladnie);
	        C.removeDelegation(j, k);
	    });
    	    delDeleBut.addClickListener(clickEvent -> {
    	        String ladnie = userIdTF.getValue();
    	        String brzydko = delegationIdTF.getValue();
    	        RestCon C = new RestCon();
    	        int k = Integer.valueOf(brzydko);
    	        int j = Integer.valueOf(ladnie);
    	        C.removeDelegation(j, k);
    	    });

    	    dEditB.addClickListener(clickEvent -> {
    	        String ladnie = delegationIdTF_1.getValue();
    	        Delegation brzydko = new Delegation(delegationStartTimeTF.getValue(), delegationEndTimeTF.getValue(), delegationDietTF.getValue(), breakfastCountTF.getValue(), dinnerCountTF.getValue(), supperCountTF.getValue(), transportTypeTF.getValue(), ticketPriceTF.getValue(), quaterPriceTF.getValue(), otherTicketsTF.getValue());
    	        RestCon C = new RestCon();
    	        int j = Integer.valueOf(ladnie);
    	        C.changeDelegation(j, brzydko);
    	    });
       	 delUButton.addClickListener(clickEvent -> {
 	        String ladnie = userNameTF.getValue();
 	        RestCon C = new RestCon();
 	        int i = Integer.valueOf(ladnie);
 	        C.deleteUserById(i);
 	    });


    	    adRightsAssignmentBu.addClickListener(clickEvent -> {
    	        String ladnie = userIdTF_2.getValue();
    	        RestCon C = new RestCon();
    	        int i = Integer.valueOf(ladnie);
    	        C.deleteUserById(i);
    	    });


    	l1.add(delUButton,uNTF);
        l2.add(delDeleBut,uIdTF,delegationIdTF);
        l3.add(dEditB,delegationStartTimeTF,delegationEndTimeTF,delegationDietTF,breakfastCountTF,dinnerCountTF,supperCountTF,transportTypeTF,ticketPriceTF,ticketPriceTF,otherTicketsTF);
        l4.add(adRightsAssignmentBu,userIdTF_2);
        l5.add(confDelB,userNameTF_2,delegationNameTF);
        l6.add(cancelDelegationButton,userNameTF_3,delegationName_3);
 
 
    }

}