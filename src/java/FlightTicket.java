
import java.util.ArrayList;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class FlightTicket {

    private String firstName;
    private String lastName;
    private String occupation;
    private String destination;
    private String travelClass;
    final private ArrayList<String> destinationOptions;
    final private ArrayList<String> travelClassOptions;

    //	CONSTRUCTOR
    public FlightTicket() {

        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Managed Bean Initialized", null);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);

        firstName = "First name";
        lastName = "Last name";
        occupation = "Private";

        destinationOptions = new ArrayList<>();
        destinationOptions.add("Copenhagen");
        destinationOptions.add("Barcelona");
        destinationOptions.add("New York");
        destinationOptions.add("Halifax");
        destinationOptions.add("Hong Kong");

        travelClassOptions = new ArrayList<>();
        travelClassOptions.add("First");
        travelClassOptions.add("Business");
        travelClassOptions.add("Economy");
    }

    //	GETTERS / SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<String> getDestinationOptions() {
        return destinationOptions;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String flightClass) {
        this.travelClass = flightClass;
    }

    public ArrayList<String> getTravelClassOptions() {
        return travelClassOptions;
    }

    public void newMessage() {
  
       char[] chars=firstName.toCharArray();
       boolean numbers=false;

              for(char c:chars)
       {
           if(Character.isDigit(c))
               numbers=true;
       }
        
        
        if (!numbers) {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Correct first name.", null);
            FacesContext.getCurrentInstance().addMessage("form1:text1", javaTextMsg);
        } else {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "You can not have numbers in your first name! Change it.", null);
            //lägger i meddelandet i nestade gText, som finna i formuläret guessForm
            FacesContext.getCurrentInstance().addMessage("form1:text1", javaTextMsg);
        }
        
        
        chars=lastName.toCharArray();
       boolean numbers2=false;

              for(char c:chars)
       {
           if(Character.isDigit(c))
               numbers2=true;
       }
        
        
        if (!numbers2) {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Correct lastname.", null);
            FacesContext.getCurrentInstance().addMessage("form1:text2", javaTextMsg);
        } else {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "You can not have numbers in your last name! Change it.", null);
            //lägger i meddelandet i nestade gText, som finna i formuläret guessForm
            FacesContext.getCurrentInstance().addMessage("form1:text2", javaTextMsg);
        }
    }

}
