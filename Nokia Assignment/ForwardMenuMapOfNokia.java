import java.util.Scanner;

public class ForwardMenuMapOfNokia {
    public static void main (String[]args)	{
        Scanner input = new Scanner(System.in);

        String menuFunctions = """
		    Welcome to the Menu functions

		    Press 1 : Phone book
		    Press 2 : Messages
		    Press 3 : Chat
		    Press 4 : Call register
		    Press 5 : Tones
		    Press 6 : Settings
		    Press 7 : Call divert
		    Press 8 : Games
		    Press 9 : Calculator
		    Press 10 : Remainders
		    Press 11 : Clock
		    Press 12 : Profiles
		    Press 13 : SIM services
    	""";

        System.out.println(menuFunctions);
        System.out.print("Press a number: ");
        int menuFunctionsChoice = input.nextInt();

	
        switch(menuFunctionsChoice) {
            case 1:
                System.out.println("Phone book");

                String phoneBook = """
                        Press 1 : Search
                        Press 2 : Service Nos
                        Press 3 : Add name
                        Press 4 : Erase
                        Press 5 : Edit
                        Press 6 : Assign
                        Press 7 : Send b'card
                        Press 8 : Options
                        Press 9 : Speed dials
                        Press 10 : Voice tags
                """;

                System.out.println(phoneBook);
                System.out.print("Press a number: ");
                int phoneBookChoice = input.nextInt();


                switch (phoneBookChoice) {
                    case 8: System.out.println("Options");
                        String optionsChoice = """
                                Press 1 : Type of view
                                Press 2 : Memory		
                        """;

                        System.out.println(optionsChoice);

               }
		break;
            case 2:
                System.out.println("Messages");

                String messages = """
                         Press 1 : Write messages
                         Press 2 : Inbox
                         Press 3 : Outbox
                         Press 4 : Picture messages
                         Press 5 : Templates
                         Press 6 : Smileys
                         Press 7 : Message settings
                         Press 8 : Info service
                         Press 9 : Voice mailbox number
                         Press 10 : Service command editor		
                """;

                System.out.println(messages);
                System.out.print("Press a number: ");
                int messagesSettingsChoice = input.nextInt();

                switch (messagesSettingsChoice) {

                    case 7:
                        System.out.println("Message settings");

                        	String messagesSettings = """
                                 Press 1 : Set 1
                                 Press 2 : Common	
                                """;



                        System.out.println(messagesSettings);
                        System.out.print("Press a number: ");
                        int messagesSettingsChoiceChoices = input.nextInt();

                        switch (messagesSettingsChoiceChoices) {
                            case 1:
                                System.out.println("Set 1");

                                String messagesSetOneSettings = """
                                         Press 1 : Message centre number
                                         Press 2 : Messages sent as
                                         Press 3 : Messages validity
                                        """;
                                System.out.println(messagesSetOneSettings);
                                break;

                            case 2:
                                System.out.println("Common");

                                String messagesCommonSettings = """
                                         Press 1 : Delivery reports
                                         Press 2 : Reply via same centre
                                         Press 3 : Character support
                                        """;

                                System.out.println(messagesCommonSettings);
                                break;
			   default: System.out.println("Invalid choice.");
                        }
                }


                break;
            case 3: System.out.println("Chat"); break;
            case 4: System.out.println("Call register");
                    String callRegister = """
			     Press 1 : Missed calls
			     Press 2 : Received calls
			     Press 3 : Dialed numbers
			     Press 4 : Erase recent call lists
			     Press 5 : Show call duration
			     Press 6 : Show call costs
			     Press 7 : Call cost settings
			     Press 8 : Prepaid credits
		            """;

                     System.out.println(callRegister);
                     System.out.print("Press a number: ");
                     int showCallDuration = input.nextInt();

                     switch(showCallDuration) {
                         case 5: System.out.println("Show call duration");
                             String showCallDurationChoice = """
                                         Press 1 : last call duration
                                         Press 2 : All calls' duration
                                         Press 3 : Received calls' duration
                                         Press 4 : Dialled calls' duration
                                         Press 5 : Clear timers
                             """;
                             System.out.println(showCallDurationChoice);
                             break;

                         case 6: System.out.println("Show call costs");
                             String showCallCostsChoice = """
                                         Press 1 : last call cost
                                         Press 2 : All calls' cost
                                         Press 3 : Clear counters
                             """;
                             System.out.println(showCallCostsChoice);
                             break;

                         case 7: System.out.println("Call cost settings");
                             String callCostSettings = """
                                         Press 1 : Call cost limit
                                         Press 2 : Show costs in
                             """;
                             System.out.println(callCostSettings);
                             break;

                         case 8: System.out.println("Prepaid credit");
			default: System.out.println("Invalid choice.");
                     }
                     break;

            case 5: System.out.println("Tones");
                String tones = """
            	        	Press 1 : Ringing tone
		                Press 2 : Ringing volume
		                Press 3 : Incoming call alert
		                Press 4 : Composer
		                Press 5 : Message alert tone
		                Press 6 : Keypad tones
		                Press 7 : Warning and game tones
		                Press 8 : Vibration alert
		                Press 9 : Screen saver
            	""";
                System.out.println(tones);
                break;

            case 6: System.out.println("Settings");
                	String settingsChoice = """
            	  	    Press 1 : Call settings
		            Press 2 : Phone settings
		            Press 3 : Security settings
		            Press 4 : Restore factory settings
            		""";

                System.out.println(settingsChoice);
                System.out.print("Press a number: ");
                int settingsChoiceChoices = input.nextInt();

                switch (settingsChoiceChoices) {
                    case 1: System.out.println("Call settings");
                        	String callSettings = """
            		            Press 1 : Automatic redial
		                    Press 2 : Speed dialing
		                    Press 3 : Call waiting options
		                    Press 4 : Own number sending
		                    Press 5 : Phone line in use
		                    Press 6 : Automatic answer
            	        	""";
                        System.out.println(callSettings);
                        break;

                    case 2: System.out.println("Phone settings");
                        	String phoneSettings = """
            		            Press 1 : Language
		                    Press 2 : Cell info display
		                    Press 3 : Welcome note
		                    Press 4 : Network selection
		                    Press 5 : Lights
		                    Press 6 : Confirm SIM service actions
            	        	""";
                        System.out.println(phoneSettings);
                        break;

                    case 3: System.out.println("Security settings");
                        String securitySettings = """
            		        Press 1 : PIN code request
		                    Press 2 : Call barring service
		                    Press 3 : Fixed dialing
		                    Press 4 : Closed user group
		                    Press 5 : Phone security
		                    Press 6 : Change access codes
            	        """;
                        System.out.println(securitySettings);
                        break;

                    case 4: System.out.println("Restore factory settings");break;
		    default: System.out.println("Invalid choice.");
                }
		break;
            case 7: System.out.println("Call divert");break;

            case 8: System.out.println("Games");break;

            case 9: System.out.println("Calculator");break;

            case 10: System.out.println("Remainders");break;

            case 11: System.out.println("Clock");
                    	String Clock = """
            		    	Press 1 : Alarm clock
		                Press 2 : Clock settings
		                Press 3 : Date settings
		                Press 4 : Stop watch
		                Press 5 : Countdown timer
		                Press 6 : Auto update of date and time
            	    	""";
                    System.out.println(Clock);
                    break;

            case 12: System.out.println("Profiles");break;
            case 13: System.out.println("SIM services");
	    default: System.out.println("Invalid choice.");
        }
    }
}
