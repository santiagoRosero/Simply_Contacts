package proofs;

import model.Agenda;
import model.Student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.ContactException;

class AgendaTest {
	private Agenda ag;

	@Test
	 public void testSearchStudentName() {
		
		try {
			Student st =new Student("Manuel  Balanta Quintero","3218746583","mbalantaq@gmail.com","07-03-00","Distrito de Aguablanca Comuna 13","A00351728","5","Software Engineering","./data/Pictures/balanta.jpg");
			assertEquals(st, ag.searchStudentPhone("3218746583"));
		} catch (ContactException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
