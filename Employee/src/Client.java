import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Iterator;


public interface Client {

	String id = "A100";
	int age =10 ;
	String sex[] = {"FEMALE","MALE"};
	String region[] = {"INNER_CITY","TOWN","RURAL","SUBURBAN"};
	double income = 1000.00;
	String married[]= {"NO","YES"};
	int children[] = {0,1,2,3};
	String hascar[] = {"NO", "YES"};
	String save_act[]={"NO","YES"};
	String current_act[] = {"NO","YES"};
	String mortgage[] = {"NO","YES"};
    String pop[]= {"YES","NO"};
	public void readData(ArrayList list);
	public void processData();
	public void printData(ArrayList list);
}



