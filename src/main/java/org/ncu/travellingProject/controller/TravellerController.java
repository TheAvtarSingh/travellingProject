package org.ncu.travellingProject.controller;


import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.ncu.travellingProject.entity.Admin;
import org.ncu.travellingProject.entity.Hotel;
import org.ncu.travellingProject.entity.HotelOwner;
import org.ncu.travellingProject.entity.User;
import org.ncu.travellingProject.entity.UserBookingDetails;
import org.ncu.travellingProject.service.travellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
//@RequestMapping("/travellerController")
public class TravellerController {

	@Autowired
	private travellingService travellingService;
	
	
	@ModelAttribute("books")
	public Hotel getBook() {
		return new Hotel();
	}
	@ModelAttribute("admin")
	public Admin getAdmin() {
		return new Admin();
	}
	
	@ModelAttribute("bookingDetails")
	public UserBookingDetails getBookings() {
		return new UserBookingDetails();
	}
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@ModelAttribute("owner")
	public HotelOwner getOwner() {
		return new HotelOwner();
	}
	
	@RequestMapping("/userSeperateModule")
	public String giveuserSeperateModule() {
		return "userSeperateloginpage";
	}
	
	
	
	@RequestMapping("/userModule")
	public String giveUserHome() {
		return "userloginpage";
	}
	@RequestMapping("/adminModule")
	public String giveadminHome() {
		return "adminloginpage";
	}
	@RequestMapping("/partnerModule")
	public String givePartnerHome() {
		return "partnerloginpage";
	}
	
	@RequestMapping("/bookmyhotel")
	public String bookmyhotel(@Valid @ModelAttribute("bookingDetails")UserBookingDetails details,BindingResult result) {
		if (result.hasErrors()) {
			return "enterDetails";
		}else {
			travellingService.bookHotel(details);
			return "doneforuser";
		}
	}
	
	
	
	@RequestMapping("/getHotelsForAdmin")
	public String getHotelsForAdmin(Model m) {
		
		
			List<Hotel> hotelList = travellingService.getHotels();
			m.addAttribute("list",hotelList);
			System.out.println("Database Enteries : ");
			System.out.println(hotelList);
			return "showlistforadmin";
		}
	
	
	
	@RequestMapping("/process")
	public String giveAvailableString(@RequestParam("destination")String location,@RequestParam("ratings")int ratings,@RequestParam("minprice")int minprice,@RequestParam("maxprice")int maxprice,Model m,@ModelAttribute("Hotel")Hotel hotel) {
		System.out.println("User Enteries : ");
		System.out.println(location);
		System.out.println(ratings);
		System.out.println(minprice);
		System.out.println(maxprice);
	
		
			List<Hotel> hotelList = travellingService.getFilteredHotels(location, minprice, maxprice, ratings);
			m.addAttribute("list",hotelList);
			System.out.println("Database Enteries : ");
			System.out.println(hotelList);
			return "showlist";
		}
	
	@RequestMapping("/userHomePage")
	public String giveUserHomePage() {
		return "userHomePage";
	}
	
	
	@RequestMapping("/AddnewHotel")
	public String AddnewHotel() {
		return "addHotelForm";
	}
	
	
	
	
	@RequestMapping("/bookHotel")
	public String bookHotel(@RequestParam("id")int hotelid, @ModelAttribute("books") Hotel hotel, Model model,HttpServletRequest request) {
		 HttpSession session = request.getSession();
		 session.setAttribute("hotelid", hotelid);
		 System.out.println(hotelid);
		return "userloginpage";
		
	}
	
	@RequestMapping("/addme")
	public String Addme(@Valid @ModelAttribute("books")Hotel hotel,BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			return "addHotelForm";
		}
		else {
			travellingService.createHotel(hotel);
			return "StatusisDone";
		}
		
	}
	
	
	@RequestMapping("/BookMe")
	public String BookMe( Model m) {
		Random random = new Random();
		int id = random.nextInt(0,1000);
		m.addAttribute("hotelid",id);
		m.addAttribute("name","User");
			return "enterDetails";
		
	}
	
	
	@RequestMapping("/signupSeperateUser")
	public String registerSeperateUserUser(HttpServletResponse response,@ModelAttribute("user")User user) {
			
Cookie c1 = new Cookie("name", user.getUsername());
response.addCookie(c1);
System.out.println(user.getUsername());
travellingService.createUser(user);

		return "showidforuser";
		
	
	}
	
	
	
	
	@RequestMapping("/signupUser")
	public String registerUser(HttpServletResponse response,@ModelAttribute("user")User user) {
			
Cookie c1 = new Cookie("name", user.getUsername());
response.addCookie(c1);
System.out.println(user.getUsername());
travellingService.createUser(user);

		return "showidforuser";
		
	
	}
	
	
	@RequestMapping("/adminDashboard")
	public String checkregisterdAdmin(@RequestParam("pass")String password,@RequestParam("uname")String uname,Model m,@ModelAttribute("admin")Admin admin,HttpSession session) {
		System.out.println(uname);
		System.out.println(password);

		List<Admin> adminList = travellingService.getadmins();
		
       ListIterator<Admin> itr = adminList.listIterator();
      String string = "";
		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (adminList.toString().contains(uname) && adminList.toString().contains(password)) {
				
				string = "adminHomePage";
			}else {
				
				string = "invalid";
			}
		}
		return string;
	}
	
	
   
	@RequestMapping("/userDashboard")
	public String checkregisterdUser(@RequestParam("pass")String password,@RequestParam("uname")String uname,Model m) {
		System.out.println(uname);
		System.out.println(password);
m.addAttribute("name",uname);
		List<User> userList = travellingService.getUsers();
		
       ListIterator<User> itr = userList.listIterator();
      String string = "";
		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (userList.toString().contains(uname) && userList.toString().contains(password)) {
				
				string = "enterDetails";
			}else {
				
				string = "invalid";
			}
		}
		return string;
	}
	
	
	
	@RequestMapping("/signupPartner")
	public String registerNewHotelOwner(HttpServletResponse response,@ModelAttribute("owner")HotelOwner owner,Model m) {
			


travellingService.createOwner(owner);

		return "showid";
		
	
	}
	
	
	

	@RequestMapping("/partnerDashboard")
	public String checkregisterdPartner(@RequestParam("number")String password,@RequestParam("uname")String uname) {
		System.out.println(uname);
		System.out.println(password);

		List<HotelOwner> ownerList = travellingService.getownersList();
		
       ListIterator<HotelOwner> itr = ownerList.listIterator();
      String string = "";
		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (ownerList.toString().contains(uname) && ownerList.toString().contains(password)) {
				string = "partnerHomePage";
			}else {
				
				string = "invalid";
			}
		}
		return string;
	}
	
	@RequestMapping("/ViewMyHotels")
	public String ViewMyHotels() {
		return "Condition";
	}
	
	@RequestMapping("/CheckBookings")
	public String CheckBookings() {
		return "ConditionForUser";
	}
	
	@RequestMapping("/getList")
	public String getList(Model m,@RequestParam("hotelNumber")int number) {
		List<Hotel> hotelList = travellingService.getTakenHotels(number);
		m.addAttribute("list",hotelList);
		return "takenhotelList";
	}
	
	@RequestMapping("/getHotelBookingList")
	public String getHotelBookingList(Model m,@RequestParam("hotelNumber")int number) {
		List<UserBookingDetails> hotelList = travellingService.getMyBookingDetails(number);
		m.addAttribute("list",hotelList);
		return "takenHotelUserList";
	}
	
	
	
	@RequestMapping("/deleteme")
	public String deleteme(Model m,@RequestParam("hotelNumber")int number) {
		 travellingService.deleteHotel(number);
		
		return "StatusisDone";
	}
	
	@RequestMapping("/deletemybookings")
	public String deletemybookings(Model m,@RequestParam("hotelNumber")int number) {
		 travellingService.deleteBooking(number);
		
		return "doneforuser";
	}
	
	
	@RequestMapping("/DeleteBookings")
	public String DeleteBookings() {
		return "ConditionforDeletionUser";
	}
	
	@RequestMapping("/DeletemyHotels")
	public String DeletemyHotels() {
		return "ConditionforDeletion";
	}
	
	@RequestMapping("/UpdatemyHotels")
	public String UpdatemyHotels() {
		return "ConditionforUpdation";
	}
	@RequestMapping("/UpdateBookings")
	public String UpdateBookings() {
		return "ConditionForUpdationUser";
	}
	
	
	@RequestMapping("/updatemybookings")
	public String updatemybookings(@Valid @ModelAttribute("bookingDetails")UserBookingDetails bookings,BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			return "ConditionForUpdationUser";
		}
		else {
			travellingService.updateBookings(getBookings());
			return "doneforuser";
		}
	}
	
	
	
	@RequestMapping("/updateme")
	public String updateme(@Valid @ModelAttribute("books")Hotel hotel,BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			return "ConditionforUpdation";
		}
		else {
			travellingService.updateHotel(hotel);
			return "StatusisDone";
		}
	}
	
	@RequestMapping("/userHomeDashboard")
	public String userHomeDashboard() {
		return "userHomePage";
	}
	
	
	
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,HttpSession session,Model model) {
		String sessionVal = (String)session.getAttribute("hotelid");
		model.addAttribute("hotelid", sessionVal);
		return "thankYou";
		
	}
	
	@RequestMapping("/userSeperateDashboard")
	public String checkregisteredSeperateUser(@RequestParam("pass")String password,@RequestParam("uname")String uname,Model m) {
		System.out.println(uname);
		System.out.println(password);
m.addAttribute("name",uname);
		List<User> userList = travellingService.getUsers();
		
       ListIterator<User> itr = userList.listIterator();
      String string = "";
		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (userList.toString().contains(uname) && userList.toString().contains(password)) {
				
				string = "userHomePage";
			}else {
				
				string = "invalid";
			}
		}
		return string;
	}
	
	

}

