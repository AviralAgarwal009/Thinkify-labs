package Driver;

import Model.Bid;
import Model.BidItem;
import Model.Buyer;
import Model.CabUser;
import Model.DriverDetails;
import Model.Location;
import Model.Seller;
import Repository.BidItemRepository;
import Repository.BidRepository;
import Repository.UserRepository;
import Service.BidService;
import Service.DriverService;
import Service.UserService;


import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.*;

import org.json.*;


public class Driver {


    public static void main(String[] args) throws IOException {
        //Perform the steps
        //Add the bid
        //if asked then it will return the winning bid
        //when someone adds a bid, for specific item, keep winning bid

    	
    	
      /*  UserRepository ur = new UserRepository();
        BidItemRepository bidItemRepo = new BidItemRepository();
        BidRepository bidRepository = new BidRepository();
        BidService bidService = new BidService();
        UserService userService = new UserService();
        
        Buyer buyer = new Buyer("sid","kop","12","google");
        Seller seller = new Seller("Omu", "Ich", "23", "infy");
        BidItem bidItem = new BidItem("ipod", 1200, 100, seller);
        Bid ob = new Bid(buyer, bidItem, 1400, null);
        bidService.createBid(ob, bidRepository);*/
    	
    	UserService u=new UserService();
    	DriverService d=new DriverService();
    	
   
    	u.addCabUser(new CabUser("abhishek",'M',23));
    	u.addCabUser(new CabUser("rahul",'M',29));
    	u.addCabUser(new CabUser("nandini",'F',22));
    	u.updateLocation("abhishek", new Location(0, 0));
    	u.updateLocation("rahul", new Location(10, 0));
    	u.updateLocation("nandini", new Location(15, 6));
    	
    	d.createDriver(new DriverDetails("driver1",'M',22,"Swift, KA-01-12345",new Location(10, 1)));
    	d.createDriver(new DriverDetails("driver2",'M',29,"Swift, KA-01-12345",new Location(11, 10)));
    	d.createDriver(new DriverDetails("driver3",'M',24,"Swift, KA-01-12345",new Location(5, 3)));

    	u.findRide("abhishek", new Location(0,0), new Location(20,1));
    	u.findRide("rahul", new Location(10,0), new Location(15,3));
    	
    	u.chooseDriver("rahul", "driver1");
    	u.calculateBill("rahul");
    	d.updateStatus("driver1", false);
    	u.findRide("nandini", new Location(15, 6), new Location(20,4));
    	d.findTotalEarning();
    	
    	
    	
    	/*u.addCabUser(new CabUser("abhishek", 'M', 29));
    	u.updateContact("abhishek", "7417083775");
    	
    
    	d.createDriver(new DriverDetails("driver1", 'M',25 , "“Swift, KA-01-12345", new Location(0, 0)));
    	d.updateStatus("driver1", true);
    	
    	ArrayList<DriverDetails> list=u.findRide("abhishek",new Location(0, 0),new Location(2,2));
    	u.findRide("abhishek", new Location(0,0), new Location(2,5));
    	u.chooseDriver("abhisehk","driver1");
    	float bill=u.calculateBill("abhisek");
    	
    	d.findTotalEarning();*/
    	


    }












}
