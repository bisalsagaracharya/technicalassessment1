package Soccer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.temporal.ChronoUnit;

public class EventManager {
    static List<Guest> guestList=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(Hobby.Dance.getClass());
        Guest g1=new Guest("Karan",LocalDate.of(1998,9,16),Country.USA, Language.English,Hobby.Eat);
        Guest g2=new Guest("Piyush",LocalDate.of(1998,8,16),Country.Spain, Language.German,Hobby.Dance);
        Guest g3=new Guest("Tarun",LocalDate.of(1998,7,16),Country.France, Language.French,Hobby.Eat);
        Guest g4=new Guest("Ahmad",LocalDate.of(1998,6,16),Country.Spain, Language.Spanish,Hobby.Dance);
        Guest g5=new Guest("Bisal",LocalDate.of(1998,5,16),Country.France, Language.Chinese,Hobby.Eat);
        Guest g6=new Guest("Govind",LocalDate.of(1998,4,16),Country.Spain, Language.Chinese,Hobby.Music);
        EventManager eventManager=new EventManager();
        eventManager.populateGuests(g1);
        eventManager.populateGuests(g2);
        eventManager.populateGuests(g3);
        eventManager.populateGuests(g4);
        eventManager.populateGuests(g5);
        eventManager.populateGuests(g6);
        System.out.println(guestList);
        System.out.println("Filteriing list");
        List<Guest> filter1a=eventManager.filterGuest1a(guestList);
        List<Guest> filter1b=eventManager.filterGuest1b(guestList);
        List<Guest> filter2=eventManager.filterGuest2(guestList);
        List<Guest> filter3=eventManager.filterGuest3(guestList);
        List<Guest> filter4=eventManager.filterGuest4(guestList);
        System.out.println("List filtered");
    }

    public void populateGuests(Guest guest){
        guestList.add(guest);
        long age=this.calculateAge(guest.getDob());
        guest.setAge(age);
        System.out.println("Guest Added: "+guest);
    }

    public List<Guest> filterGuest1a(List<Guest> guestList){
        List<Guest> filteredGuestList1a=guestList.stream().filter(guest -> guest.getCountry().equals(Country.Spain) &&
                                        (guest.getHobby().equals(Hobby.Music)|| guest.getHobby().equals(Hobby.Dance))).collect(Collectors.toList());
        return filteredGuestList1a;
    }
    public List<Guest> filterGuest1b(List<Guest> guestList){
        List<Guest> filteredGuestList1b=guestList.stream().filter(guest -> guest.getCountry().equals(Country.Spain) &&
                guest.getHobby().equals(Hobby.Drink) && guest.getAge()>=18).collect(Collectors.toList());
        return filteredGuestList1b;
    }
    public List<Guest> filterGuest2(List<Guest> guestList){
        List<Guest> filteredGuestList2=guestList.stream().filter(guest -> guest.getCountry().equals(Country.France) &&
                guest.getHobby().equals(Hobby.WaterSports)).collect(Collectors.toList());
        return filteredGuestList2;
    }
    public List<Guest> filterGuest3(List<Guest> guestList){
        List<Guest> filteredGuestList3=guestList.stream().filter(guest -> guest.getAge()>=71).collect(Collectors.toList());
        return filteredGuestList3;
    }
    public List<Guest> filterGuest4(List<Guest> guestList){
        List<Guest> filteredGuestList4=guestList.stream().filter(guest -> guest.getLanguage().equals(Language.Chinese) &&
                guest.getHobby().equals(Hobby.Read)).collect(Collectors.toList());
        return filteredGuestList4;
    }
    public long calculateAge(LocalDate date){
        return ChronoUnit.YEARS.between(date, LocalDate.now());
    }
}
