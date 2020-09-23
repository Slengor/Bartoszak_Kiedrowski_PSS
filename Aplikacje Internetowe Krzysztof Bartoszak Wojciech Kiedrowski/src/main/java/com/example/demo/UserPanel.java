package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;



@Route("/User")
public class UserPanel extends VerticalLayout {
	
	@Autowired
	private UsersRepository repo;
	
	@Autowired
	private DelegationService service2;

	private Button dodajzap, dodajlist, edzad, wycof;
	
    public UserPanel() {
    	dodajzap = new Button("Zapisz do PDF");
    	dodajlist = new Button("Drukuj");
    	edzad = new Button("Potwierdz ");
    	wycof = new Button("Wycofaj Potwierdzenie ");
        add(new Text("panel uz"));
        
        add(dodajzap, dodajlist, edzad, wycof);
       
        dodajzap.addClickListener(e->{
        	service2.toPdf();
        });
        dodajlist.addClickListener(e->{
        	service2.drukuj();
        });
        edzad.addClickListener(e->{
        		service2.edytuj();
        });
        wycof.addClickListener(e->{
        	service2.wycofaj();
        });
    }

}