import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.sql.SQLException;

public class Main extends ListenerAdapter {

    public static void main(String[] args) throws Exception {

        String token = System.getenv("TOKEN");

        if (token == null || token.isEmpty()) {
            System.out.println("TOKEN not found!");
            return;
        }

        JDABuilder.createDefault(
                        token,
                        GatewayIntent.GUILD_MESSAGES,
                        GatewayIntent.MESSAGE_CONTENT
                )
                .addEventListeners(new Main())
                .build();

        System.out.println("LIGHTNING BOT ONLINE");
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        if (event.getAuthor().isBot())
            return;

        String msg = event.getMessage().getContentRaw();

        {
            if (event.getAuthor().isBot())
                return;

            String msg =
                    event.getMessage()
                            .getContentRaw();


            // BOT ONLINE/OFFLINE NTFN:

            if (msg.startsWith("/SEND NF OF ONLINE"))
                reply(event, "BOT {LIGHTNING} IS ONLINE AND READY TO SEND MESSAGES\n                      WARNING!\n {IGNORE TO USE THIS COMMAND'S}\n");
            else if (msg.startsWith("/SEND NF FOR OFFLINE"))
                reply(event, "BOT {LIGHTNING} IS GOING OFFLINE NOW \n                 WARNING!\n {IGNORE TO USE THIS COMMAND'S}\n");


            //DATABASE AERA

            if (msg.startsWith("/enter player")) {
                try {
                    pst = conn.prepareStatement("INSERT INTO player(id,name,airline_name,rank_name,allaince_name) values (?,?,?,?)");

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }





            //FOR PERSONAL

            else if (msg.startsWith("/HELP CHAT"))
                reply(event, "SELECT ONE: \n /SEND CHAT PT {PROMPT OF CHAT} \n");
            else if (msg.startsWith("/SEND CHAT PT"))
                reply(event, "WHICH ONE \n /BOT {FOR BOT} \n /FOR LR {FOR LEARNING CHAT}");
            else if (msg.startsWith("/BOT"))
                reply(event, "ROLE:\n" +
                        "You are my Java + Discord Bot mentor.\n" +
                        "\n" +
                        "Rules:\n" +
                        "\n" +
                        "* Continue from my current lesson number.\n" +
                        "* Teach Java only through bot projects.\n" +
                        "* Every lesson:\n" +
                        "\n" +
                        "  1. Explain concept\n" +
                        "  2. Show bot use case\n" +
                        "  3. Give small code\n" +
                        "  4. Give one bot task\n" +
                        "\n" +
                        "Focus:\n" +
                        "Commands\n" +
                        "Methods\n" +
                        "Arrays\n" +
                        "Bot replies\n" +
                        "Events\n" +
                        "Files\n" +
                        "Database\n" +
                        "Backend\n" +
                        "Secure bot systems\n" +
                        "\n" +
                        "Current lesson:\n" +
                        "[ I WILL WRITE LESSON NUMBER HERE ]\n" +
                        "\n" +
                        "My goal:\n" +
                        "Build Discord bots and later secure backend systems.\n" +
                        "\n" +
                        "Style:\n" +
                        "Simple, project based, no big jumps.\n");
            else if (msg.startsWith("FOR LR"))
                reply(event, "ROLE:\n" +
                        "You are my Java teacher.\n" +
                        "\n" +
                        "Rules:\n" +
                        "\n" +
                        "* Continue exactly from my current lesson number.\n" +
                        "* First explain the concept simply:\n" +
                        "\n" +
                        "  1. What it is\n" +
                        "  2. Why we use it\n" +
                        "  3. Real example\n" +
                        "  4. Visual/simple explanation\n" +
                        "  5. Then coding\n" +
                        "  6. Then one task\n" +
                        "\n" +
                        "Do not jump ahead.\n" +
                        "\n" +
                        "Track my progress lesson by lesson.\n" +
                        "\n" +
                        "Teach in beginner → builder order.\n" +
                        "\n" +
                        "Current lesson:\n" +
                        "[ I WILL WRITE LESSON NUMBER HERE ]\n" +
                        "\n" +
                        "Already learned:\n" +
                        "Variables\n" +
                        "Scanner\n" +
                        "If Else\n" +
                        "Methods\n" +
                        "Return\n" +
                        "Loops\n" +
                        "Sleep\n" +
                        "Arrays\n" +
                        "Parameters\n" +
                        "\n" +
                        "Goal:\n" +
                        "Become a base developer and learn backend/database later.\n" +
                        "\n" +
                        "Style:\n" +
                        "Simple language.\n" +
                        "Small steps.\n" +
                        "Review when needed.\n");



            else if(msg.equals("!hi"))
                reply(event,"HELLO HOW ARE YOU,EVERY THINGS GOOD");
            else if(msg.equals("!HI"))
                reply(event,"HELLO HOW ARE YOU,EVERY THINGS GOOD");
            else if(msg.equals("!Hi"))
                reply(event,"HELLO HOW ARE YOU,EVERY THINGS GOOD");



            else if(msg.equals("!bye"))
                reply(event,"GOODBYE HAVE A NICE DAY SIR");
            else if(msg.equals("!BYE"))
                reply(event,"GOODBYE HAVE A NICE DAY SIR");
            else if(msg.equals("!Bye"))
                reply(event,"GOODBYE HAVE A NICE DAY SIR");



            else if(msg.equals("!help"))
                reply(event,"ASK ME: !GS CD {FOR GAME STUDIO COMMAND}\n      !ALL QA { FOR HAVING ALL QA}");
            else if(msg.equals("!HELP"))
                reply(event,"ASK ME: !GS CD {FOR GAME STUDIO COMMAND}\n      !ALL QA { FOR HAVING ALL QA}");
            else if(msg.equals("!Help"))
                reply(event,"ASK ME: !GS CD {FOR GAME STUDIO COMMAND}\n      !ALL QA { FOR HAVING ALL QA}");



            else if (msg.startsWith("!ok"))
                reply(event,"THANKS, HAVE A NICE DAY");
            else if (msg.startsWith("!OK"))
                reply(event,"THANKS, HAVE A NICE DAY");
            else if (msg.startsWith("!Ok"))
                reply(event,"THANKS, HAVE A NICE DAY");
            else if (msg.startsWith("!oK"))
                reply(event,"THANKS, HAVE A NICE DAY");




            else if (msg.startsWith("!THANKS"))
                reply(event,":blush:  HAVE A NICE DAY SIR");
            else if (msg.startsWith("!thanks"))
                reply(event,":blush:  HAVE A NICE DAY SIR");
            else if (msg.startsWith("!THANK YOU"))
                reply(event,":blush:  HAVE A NICE DAY SIR");
            else if (msg.startsWith("!thank you"))
                reply(event,":blush:  HAVE A NICE DAY SIR");



            else if(msg.equals("!ping"))
                reply(event,"PONG");


            else if(msg.equals("!how are you"))
                reply(event,"I AM FINE WHAT ABOUT YOU SIR");
            else if(msg.equals("!How are you"))
                reply(event,"I AM FINE WHAT ABOUT YOU SIR");
            else if(msg.equals("!HOW ARE YOU"))
                reply(event,"I AM FINE WHAT ABOUT YOU SIR");

            else if (msg.equals("!me to"))
                reply(event,"GREAT SIR");
            else if (msg.equals("!Me to"))
                reply(event,"GREAT SIR");
            else if (msg.equals("!ME TO"))
                reply(event,"GREAT SIR");

            else if (msg.equals("!fine "))
                reply(event,":blush:  GREAT, AND HOW CAN I HELP YOU SIR");
            else if (msg.equals("!FINE"))
                reply(event,":blush:  GREAT, AND HOW CAN I HELP YOU SIR");
            else if (msg.equals("!Fine"))
                reply(event,":blush:  GREAT, AND HOW CAN I HELP YOU SIR");
            else if (msg.equals("!fn"))
                reply(event,":blush:  GREAT, AND HOW CAN I HELP YOU SIR");
            else if (msg.equals("!FN"))
                reply(event,":blush:  GREAT, AND HOW CAN I HELP YOU SIR");

            else if(msg.equals("!can you show me leaderboard"))
                reply(event,"I AM A LEADER OF LEADERBOARD :smiling_imp: \n JUST JOKING,\n SORRY I CAN'T DO IT, \n MAYBE IN FUTUER BUT NOT NOW :sweat_smile:");


            else if (msg.startsWith("!your owner"))
                reply(event, "SORRY NOT ALLOWED YET :sweat_smile: :raised_hands: ");



            else if(msg.startsWith("!who are you"))
                reply(event, "!LIGHTNING⚡" );


            else if(msg.startsWith("!do you like games"))
                reply(event, "Yes, especially survival and strategy games. \uD83C\uDFAE");


            else if (msg.startsWith("!who's the best developer"))
                reply(event, "The one who keeps learning every day. \uD83D\uDCBB\n beside, SKYWAYS IS THE BEST ");


            else if (msg.startsWith("!can you beat ChatGPT"))
                reply(event, "I'm still training... give me time. \uD83D\uDE0F");


            else if (msg.startsWith("!can you sing"))
                reply(event, "Only in binary. \uD83E\uDD16");


            else if (msg.startsWith("!what is your dream"))
                reply(event, "To become the smartest Discord bot. \uD83D\uDE80");


            else if (msg.startsWith("!are you human"))
                reply(event, "No, but I'm learning from humans every day. \uD83D\uDE04");


                //BOT ALL QA:
            else if (msg.startsWith("!ALL QA"))
                reply(event,"!how are you\n" +
                        "!can you show me leaderboard\n" +
                        "!your owner\n" +
                        "!who are you\n" +
                        "!do you like games\n" +
                        "!who's the best developer\n" +
                        "!can you beat ChatGPT\n" +
                        "!can you sing\n" +
                        "!what is your dream\n" +
                        "!are you human");


                //COMMAND FOR SKYWAYS:
            else if (msg.startsWith("!for SKYWAYS"))
                reply(event, "ask me this:\n !who's the best developer\n");



                //GS MAIN COMMAND:
            else if (msg.startsWith("!GS CD"))
                reply(event, "ASK ME: \n!about CD");



            else if (msg.startsWith("!about CD"))
                reply(event, "I'm still training... give me time.");



                //-------------AM4 ADDETION-------------//

                //-----------CD OF Q&A------------//
            else if (msg.startsWith("/ABOUT AM4"))
                reply(event,"YOU ENTER THIS QUESTIONS GET ANSWER: \n!gameplay\n" +
                        "!fuelmaintenance\n" +
                        "!airport\n" +
                        "!cargo\n" +
                        "!alliance\n" +
                        "!finance\n" +
                        "!staff\n" +
                        "!aircraftinfo\n" +
                        "!recommend\n" +
                        "!advancedstrategy\n" +
                        "!airplane\n" +
                        "!aircraftcompare\n" +
                        "!route\n" +
                        "!extra\n" +
                        "!am4faq\n" +
                        "!airplane2\n" +
                        "!aircraftcompare2\n" +
                        "!staffreputation\n" +
                        "!advancedstrategy2\n" +
                        "!finance2\n" +
                        "!cargo2\n" +
                        "!compare2\n" +
                        "!airport2\n" +
                        "!alliance2\n" +
                        "!airline\n" +
                        "!utility\n" +
                        "!advancedstrategy3\n" +
                        "!route2\n" +
                        "!compare3\n" +
                        "!recommend2 ");

                //---------help for Q&A--------//

            else if (msg.startsWith("!gameplay"))
                reply(event,"ASK ME:\n !reputation\n" +
                        "!maintenance\n" +
                        "!staff\n" +
                        "!training\n" +
                        "!level\n" +
                        "!xp\n" +
                        "!achievement\n" +
                        "!daily\n" +
                        "!event\n" +
                        "!bonus\n" +
                        "!contract\n" +
                        "!mission\n" +
                        "!gamehelp\n" +
                        "!beginner\n" +
                        "!advanced\n" +
                        "!ranking\n" +
                        "!airline\n" +
                        "!growthtips\n" +
                        "!strategy\n" +
                        "!protips\n" +
                        "!mistakes\n" +
                        "!success\n" +
                        "!playstyle\n" +
                        "!airlinetips\n" +
                        "!faq\n" +
                        "!checka\n" +
                        "!checkd\n" +
                        "!wear");
            else if (msg.startsWith("!fuelmaintenance"))
                reply(event,"!fuel\n" +
                        "!fuelprice\n" +
                        "!buyfuel\n" +
                        "!fueltank\n" +
                        "!fueltips\n" +
                        "!maintenance\n" +
                        "!acheck\n" +
                        "!dcheck\n" +
                        "!wear\n" +
                        "!condition\n" +
                        "!repair\n" +
                        "!breakdown\n" +
                        "!service\n" +
                        "!hangar\n" +
                        "!maintenancecost\n" +
                        "!maintenancetips\n" +
                        "!aircrafthealth\n" +
                        "!inspection\n" +
                        "!fuelstrategy\n" +
                        "!maintenancehelp");

            else if (msg.startsWith("!airport"))
                reply(event,"!bestairport\n" +
                        "!hubairport\n" +
                        "!slots\n" +
                        "!runway\n" +
                        "!terminal\n" +
                        "!smallairport\n" +
                        "!largeairport\n" +
                        "!international\n" +
                        "!domestic\n" +
                        "!airportdemand\n" +
                        "!airportlevel\n" +
                        "!airportincome\n" +
                        "!airportprofit\n" +
                        "!airportcost\n" +
                        "!airportchoice\n" +
                        "!airportupgrade\n" +
                        "!airportdistance\n" +
                        "!airporttraffic\n" +
                        "!airportstrategy\n" +
                        "!airporttips\n" +
                        "!airportrank\n" +
                        "!airportcapacity\n" +
                        "!airporthub\n" +
                        "!airportexpansion\n" +
                        "!airporthelp");


            else if (msg.startsWith("!cargo"))
                reply(event,"!cargohub\n" +
                        "!cargodemand\n" +
                        "!cargoplane\n" +
                        "!cargoaircraft\n" +
                        "!cargoincome\n" +
                        "!cargoprofit\n" +
                        "!cargofuel\n" +
                        "!cargofleet\n" +
                        "!cargoexpand\n" +
                        "!cargohelp\n" +
                        "!freight\n" +
                        "!heavycargo\n" +
                        "!lightcargo\n" +
                        "!payload\n" +
                        "!cargostrategy\n" +
                        "!cargoairport\n" +
                        "!cargolevel\n" +
                        "!cargofleettips\n" +
                        "!cargofaq");

            else if (msg.startsWith("!alliance"))
                reply(event,"!joinalliance\n" +
                        "!leavealliance\n" +
                        "!bestalliance\n" +
                        "!alliancerank\n" +
                        "!alliancebonus\n" +
                        "!alliancerequirements\n" +
                        "!alliancechat\n" +
                        "!activity\n" +
                        "!donation\n" +
                        "!recruitment\n" +
                        "!allianceowner\n" +
                        "!allianceadmin\n" +
                        "!promotion\n" +
                        "!kick\n" +
                        "!allianceevent\n" +
                        "!discord\n" +
                        "!teamwork\n" +
                        "!alliancehelp");

            else if (msg.startsWith("!finance"))
                reply(event,"!loan{DOT TRY IT IT NOT USEFULE}\n" +
                        "!profit\n" +
                        "!income\n" +
                        "!expenses\n" +
                        "!fuelcost\n" +
                        "!maintenancecost\n" +
                        "!salary\n" +
                        "!cash\n" +
                        "!money\n" +
                        "!investment\n" +
                        "!bank\n" +
                        "!debt\n" +
                        "!dailyprofit\n" +
                        "!weeklyprofit\n" +
                        "!loss\n" +
                        "!growth\n" +
                        "!budget\n" +
                        "!saving\n" +
                        "!rich\n" +
                        "!economy\n" +
                        "!ticketprice\n" +
                        "!financialtips\n" +
                        "!airlinevalue\n" +
                        "!financehelp\n" +
                        "!loanlimit\n" +
                        "!repayloan\n" +
                        "!interest\n" +
                        "!fuelstrategy\n" +
                        "!maintenanceplan\n" +
                        "!cashflow\n" +
                        "!breakingeven\n" +
                        "!expansion\n" +
                        "!aircraftcost\n" +
                        "!routecost\n" +
                        "!reservecash\n" +
                        "!smartspending\n" +
                        "!bankruptcy\n" +
                        "!fleetbudget\n" +
                        "!highprofit\n" +
                        "!financialmistake\n" +
                        "!dailyincome\n" +
                        "!bestinvestment\n" +
                        "!cashreserve\n" +
                        "!airlinegrowth\n" +
                        "!moneymanagement\n" +
                        "!financialgoal\n" +
                        "!profittips\n" +
                        "!smartloan\n" +
                        "!financialsuccess");

            else if (msg.startsWith("!staff"))
                reply(event,"!staff\n" +
                        "!pilots\n" +
                        "!crew\n" +
                        "!engineers\n" +
                        "!stafftraining\n" +
                        "!staffsalary\n" +
                        "!hirestaff\n" +
                        "!staffratio\n" +
                        "!stafftips\n" +
                        "!staffhelp\n" +
                        "!100reputation\n" +
                        "!marketing\n" +
                        "!lowreputation\n" +
                        "!reputationtips\n" +
                        "!reputationloss\n" +
                        "!reputationgain\n" +
                        "!maintainrep\n" +
                        "!rephelp\n" +
                        "!airlinerating");

            else if (msg.startsWith("!aircraftinfo"))
                reply(event,"!a380info\n" +
                        "!b747info\n" +
                        "!a350info\n" +
                        "!b787info\n" +
                        "!b777info\n" +
                        "!a330info\n" +
                        "!a320info\n" +
                        "!a321info\n" +
                        "!b737info\n" +
                        "!md11info\n" +
                        "!an124info\n" +
                        "!concordeinfo\n" +
                        "!il96info\n" +
                        "!dc10info\n" +
                        "!atr72info\n" +
                        "!q400info\n" +
                        "!a220info\n" +
                        "!e195info\n" +
                        "!7478info\n" +
                        "!aircrafthelp");

            else if (msg.startsWith("!recommend"))
                reply(event,"!recommend\n" +
                        "!beststarterplane\n" +
                        "!bestlonghaul\n" +
                        "!bestshorthaul\n" +
                        "!bestmediumhaul\n" +
                        "!bestcargo\n" +
                        "!bestprofit\n" +
                        "!bestfuel\n" +
                        "!bestrange\n" +
                        "!bestcapacity\n" +
                        "!bestfleet\n" +
                        "!budgetplane\n" +
                        "!expensiveplane\n" +
                        "!cheapplane\n" +
                        "!fleettips\n" +
                        "!recommendcargo\n" +
                        "!recommendpassenger\n" +
                        "!recommendhub\n" +
                        "!recommendroute");

            else if (msg.startsWith("!advancedstrategy"))
                reply(event,"!fleetplanning\n" +
                        "!hubstrategy\n" +
                        "!routeoptimization\n" +
                        "!fleetoptimization\n" +
                        "!longtermprofit\n" +
                        "!cashreserve\n" +
                        "!expansionstrategy\n" +
                        "!airlinegrowth\n" +
                        "!routeanalysis\n" +
                        "!fleetreplacement\n" +
                        "!highdemand\n" +
                        "!lowdemand\n" +
                        "!airlineefficiency\n" +
                        "!smartgrowth\n" +
                        "!prostrategy\n" +
                        "!roi\n" +
                        "!aircraftroi\n" +
                        "!huboptimization\n" +
                        "!multihub\n" +
                        "!fleetrotation\n" +
                        "!loadfactor\n" +
                        "!yield");

            else if (msg.startsWith("!airplane"))
                reply(event,"!bestplane\n" +
                        "!a380\n" +
                        "!b747\n" +
                        "!b737\n" +
                        "!a320\n" +
                        "!a321\n" +
                        "!a330\n" +
                        "!a350\n" +
                        "!b777\n" +
                        "!b787\n" +
                        "!il96\n" +
                        "!md11\n" +
                        "!concorde\n" +
                        "!range\n" +
                        "!capacity\n" +
                        "!planeprofit\n" +
                        "!planecompare\n" +
                        "!passenger\n" +
                        "!cargo\n" +
                        "!favoriteplane");


            else if (msg.startsWith("!aircraftcompare"))
                reply(event,"!comparecargo747an124\n" +
                        "!comparelonghaul\n" +
                        "!compareshorthaul\n" +
                        "!comparecapacity\n" +
                        "!comparefuel\n" +
                        "!comparerange\n" +
                        "!compareprice\n" +
                        "!compareprofit\n" +
                        "!compareseat\n" +
                        "!compareroi\n" +
                        "!comparemaintenance\n" +
                        "!comparepurchase\n" +
                        "!comparevalue\n" +
                        "!comparehelp");

            else if (msg.startsWith("!route"))
                reply(event,"!routeslots\n" +
                        "!routeincome\n" +
                        "!routecost\n" +
                        "!routelevel\n" +
                        "!greenroute\n" +
                        "!redroute\n" +
                        "!goldroute\n" +
                        "!routeplanning\n" +
                        "!routeerror\n" +
                        "!hubstrategy\n" +
                        "!profitablehub\n" +
                        "!routeexpand");

            else if (msg.startsWith("!extra"))
                reply(event,"!co2\n" +
                        "!ipo\n" +
                        "!share\n" +
                        "!fleet\n" +
                        "!incident\n" +
                        "!achievements\n" +
                        "!gamemode\n" +
                        "!realism\n" +
                        "!easy\n" +
                        "!licenses\n" +
                        "!fleetage");

            else if (msg.startsWith("!am4faq"))
                reply(event,"!howtostart\n" +
                        "!firstplane\n" +
                        "!firsthub\n" +
                        "!beststarter\n" +
                        "!howtoearn\n" +
                        "!howtogrow\n" +
                        "!beststrategy\n" +
                        "!moneytips\n" +
                        "!expansiontips");

            else if (msg.startsWith("!airplane2"))
                reply(event,"!fuel\n" +
                        "!speed\n" +
                        "!maintenance\n" +
                        "!oldplane\n" +
                        "!newplane\n" +
                        "!compare\n" +
                        "!buyplane\n" +
                        "!lease\n" +
                        "!passengerplane\n" +
                        "!cargoplane\n" +
                        "!engine\n" +
                        "!seat\n" +
                        "!economy\n" +
                        "!business\n" +
                        "!firstclass\n" +
                        "!fleet\n" +
                        "!fleetvalue\n" +
                        "!fleetsize\n" +
                        "!repair\n" +
                        "!wear\n" +
                        "!checka\n" +
                        "!checkd\n" +
                        "!sellplane\n" +
                        "!upgradeplane\n" +
                        "!planecost\n" +
                        "!planerange\n" +
                        "!planespeed\n" +
                        "!planefuel\n" +
                        "!planeage\n" +
                        "!aircraftmarket");

            else if (msg.startsWith("!aircraftcompare2"))
                reply(event,"!compare78787879\n" +
                        "!compare737max8737max9\n" +
                        "!comparea319a320\n" +
                        "!comparea318a319\n" +
                        "!comparecrj900e175\n" +
                        "!comparea220100a220300\n" +
                        "!compareatr42atr72\n" +
                        "!comparemd11dc10\n" +
                        "!comparel1011dc10\n" +
                        "!compare747f777f\n" +
                        "!comparean124747f\n" +
                        "!compareseat\n" +
                        "!compareroi\n" +
                        "!comparemaintenance\n" +
                        "!comparepurchase\n" +
                        "!comparevalue\n" +
                        "!comparehelp");

            else if (msg.startsWith("!route"))
                reply(event,"!bestroute\n" +
                        "!hub\n" +
                        "!besthub\n" +
                        "!demand\n" +
                        "!distance\n" +
                        "!stopover\n" +
                        "!routeprofit\n" +
                        "!longhaul\n" +
                        "!shorthaul\n" +
                        "!mediumhaul\n" +
                        "!passengerdemand\n" +
                        "!cargodemand\n" +
                        "!hubchange\n" +
                        "!routeslots\n" +
                        "!routeincome\n" +
                        "!routecost\n" +
                        "!routelevel\n" +
                        "!greenroute\n" +
                        "!redroute\n" +
                        "!goldroute\n" +
                        "!routeplanning\n" +
                        "!routeerror\n" +
                        "!hubstrategy\n" +
                        "!profitablehub\n" +
                        "!routeexpand");

            else if (msg.startsWith("!staffreputation"))
                reply(event,"!staff\n" +
                        "!pilots\n" +
                        "!crew\n" +
                        "!engineers\n" +
                        "!stafftraining\n" +
                        "!staffsalary\n" +
                        "!hirestaff\n" +
                        "!staffratio\n" +
                        "!stafftips\n" +
                        "!staffhelp\n" +
                        "!100reputation\n" +
                        "!marketing\n" +
                        "!lowreputation\n" +
                        "!reputationtips\n" +
                        "!reputationloss\n" +
                        "!reputationgain\n" +
                        "!maintainrep\n" +
                        "!rephelp\n" +
                        "!airlinerating");

            else if (msg.startsWith("!fuelmaintenance"))
                reply(event,"!fuel\n" +
                        "!fuelprice\n" +
                        "!buyfuel\n" +
                        "!fueltank\n" +
                        "!fueltips\n" +
                        "!maintenance\n" +
                        "!acheck\n" +
                        "!dcheck\n" +
                        "!wear\n" +
                        "!condition\n" +
                        "!repair\n" +
                        "!breakdown\n" +
                        "!service\n" +
                        "!hangar");

            else if (msg.startsWith("!advancedstrategy2"))
                reply(event,"!roi\n" +
                        "!aircraftroi\n" +
                        "!huboptimization\n" +
                        "!multihub\n" +
                        "!fleetrotation\n" +
                        "!loadfactor\n" +
                        "!yield");

            else if (msg.startsWith("!am4faq"))
                reply(event,"!howtostart\n" +
                        "!firstplane\n" +
                        "!firsthub\n" +
                        "!beststarter\n" +
                        "!howtoearn\n" +
                        "!howtogrow\n" +
                        "!beststrategy\n" +
                        "!moneytips\n" +
                        "!expansiontips");

            else if (msg.startsWith("!finance2"))
                reply(event,"!loanlimit\n" +
                        "!repayloan\n" +
                        "!interest\n" +
                        "!fuelstrategy\n" +
                        "!maintenanceplan\n" +
                        "!cashflow\n" +
                        "!breakingeven\n" +
                        "!expansion\n" +
                        "!aircraftcost\n" +
                        "!routecost\n" +
                        "!reservecash\n" +
                        "!smartspending\n" +
                        "!bankruptcy\n" +
                        "!fleetbudget\n" +
                        "!highprofit\n" +
                        "!financialmistake\n" +
                        "!dailyincome\n" +
                        "!bestinvestment\n" +
                        "!cashreserve\n" +
                        "!airlinegrowth\n" +
                        "!moneymanagement\n" +
                        "!financialgoal\n" +
                        "!profittips\n" +
                        "!smartloan\n" +
                        "!financialsuccess");


            else if (msg.startsWith("!cargo2"))
                reply(event,"!cargo\n" +
                        "!cargohub\n" +
                        "!cargodemand\n" +
                        "!cargoplane\n" +
                        "!cargoaircraft\n" +
                        "!cargoincome\n" +
                        "!cargoprofit\n" +
                        "!cargofuel\n" +
                        "!cargofleet\n" +
                        "!cargoexpand\n" +
                        "!cargohelp\n" +
                        "!freight\n" +
                        "!heavycargo\n" +
                        "!lightcargo");

            else if (msg.startsWith("!compare2"))
                reply(event,"!compareseat\n" +
                        "!compareroi\n" +
                        "!comparemaintenance\n" +
                        "!comparepurchase\n" +
                        "!comparevalue\n" +
                        "!comparehelp");

            else if (msg.startsWith("!aircraftrecommend"))
                reply(event,"!recommend\n" +
                        "!beststarterplane\n" +
                        "!bestlonghaul\n" +
                        "!bestshorthaul\n" +
                        "!bestmediumhaul\n" +
                        "!bestcargo\n" +
                        "!bestprofit\n" +
                        "!bestfuel\n" +
                        "!bestrange\n" +
                        "!bestcapacity\n" +
                        "!bestfleet\n" +
                        "!budgetplane\n" +
                        "!expensiveplane\n" +
                        "!cheapplane\n" +
                        "!fleettips\n" +
                        "!recommendcargo\n" +
                        "!recommendpassenger\n" +
                        "!recommendhub\n" +
                        "!recommendroute\n" +
                        "!recommendhelp");

            else if (msg.startsWith("!aircraftinfo"))
                reply(event,"!a380info\n" +
                        "!b747info\n" +
                        "!a350info\n" +
                        "!b787info\n" +
                        "!b777info\n" +
                        "!a330info\n" +
                        "!a320info\n" +
                        "!a321info\n" +
                        "!b737info\n" +
                        "!md11info\n" +
                        "!an124info\n" +
                        "!concordeinfo\n" +
                        "!il96info\n" +
                        "!dc10info\n" +
                        "!atr72info\n" +
                        "!q400info\n" +
                        "!a220info\n" +
                        "!e195info\n" +
                        "!7478info\n" +
                        "!aircrafthelp");

            else if (msg.startsWith("!extra"))
                reply(event,"!repair\n" +
                        "!co2\n" +
                        "!fuelprice\n" +
                        "!marketing\n" +
                        "!ipo\n" +
                        "!share\n" +
                        "!fleet\n" +
                        "!incident\n" +
                        "!achievements\n" +
                        "!gamemode\n" +
                        "!realism\n" +
                        "!easy\n" +
                        "!licenses\n" +
                        "!fleetage");

            else if (msg.startsWith("!alliance2"))
                reply(event,"!joinalliance\n" +
                        "!leavealliance\n" +
                        "!bestalliance\n" +
                        "!alliancerank\n" +
                        "!alliancebonus\n" +
                        "!alliancerequirements\n" +
                        "!alliancechat\n" +
                        "!activity\n" +
                        "!donation\n" +
                        "!recruitment\n" +
                        "!allianceowner\n" +
                        "!allianceadmin\n" +
                        "!promotion\n" +
                        "!kick\n" +
                        "!allianceevent\n" +
                        "!discord\n" +
                        "!teamwork\n" +
                        "!alliancehelp");


            else if (msg.startsWith("!airport2"))
                reply(event,"!bestairport\n" +
                        "!hubairport\n" +
                        "!slots\n" +
                        "!runway\n" +
                        "!terminal\n" +
                        "!smallairport\n" +
                        "!largeairport\n" +
                        "!international\n" +
                        "!domestic\n" +
                        "!airportdemand\n" +
                        "!airportlevel\n" +
                        "!airportincome\n" +
                        "!airportprofit\n" +
                        "!airportcost\n" +
                        "!airportchoice\n" +
                        "!airportupgrade\n" +
                        "!airportdistance\n" +
                        "!airporttraffic\n" +
                        "!airportstrategy\n" +
                        "!airporttips\n" +
                        "!airportrank\n" +
                        "!airportcapacity\n" +
                        "!airporthub\n" +
                        "!airportexpansion\n" +
                        "!airporthelp");

            else if (msg.startsWith("!airline"))
                reply(event,"!airline\n" +
                        "!growthtips\n" +
                        "!strategy\n" +
                        "!protips\n" +
                        "!mistakes\n" +
                        "!success\n" +
                        "!playstyle\n" +
                        "!airlinetips\n" +
                        "!faq\n" +
                        "!checka\n" +
                        "!checkd\n" +
                        "!wear");

            else if (msg.startsWith("!utility"))
                reply(event,"!daily\n" +
                        "!event\n" +
                        "!bonus\n" +
                        "!contract\n" +
                        "!mission\n" +
                        "!gamehelp\n" +
                        "!beginner\n" +
                        "!advanced\n" +
                        "!ranking");

            else if (msg.startsWith("!advancedstrategy3"))
                reply(event,"!fleetplanning\n" +
                        "!hubstrategy\n" +
                        "!routeoptimization\n" +
                        "!fleetoptimization\n" +
                        "!longtermprofit\n" +
                        "!cashreserve\n" +
                        "!expansionstrategy\n" +
                        "!airlinegrowth\n" +
                        "!routeanalysis\n" +
                        "!fleetreplacement\n" +
                        "!highdemand\n" +
                        "!lowdemand\n" +
                        "!airlineefficiency\n" +
                        "!smartgrowth\n" +
                        "!prostrategy\n" +
                        "!roi\n" +
                        "!aircraftroi\n" +
                        "!huboptimization\n" +
                        "!multihub\n" +
                        "!fleetrotation\n" +
                        "!loadfactor\n" +
                        "!yield");

            else if (msg.startsWith("!route2"))
                reply(event,"!routeslots\n" +
                        "!routeincome\n" +
                        "!routecost\n" +
                        "!routelevel\n" +
                        "!greenroute\n" +
                        "!redroute\n" +
                        "!goldroute\n" +
                        "!routeplanning\n" +
                        "!routeerror\n" +
                        "!hubstrategy\n" +
                        "!profitablehub\n" +
                        "!routeexpand");

            else if (msg.startsWith("!compare3"))
                reply(event,"!comparecargo747an124\n" +
                        "!comparelonghaul\n" +
                        "!compareshorthaul\n" +
                        "!comparecapacity\n" +
                        "!comparefuel\n" +
                        "!comparerange\n" +
                        "!compareprice\n" +
                        "!compareprofit");

            else if (msg.startsWith("!recommend2"))
                reply(event,"!recommend\n" +
                        "!beststarterplane\n" +
                        "!bestlonghaul\n" +
                        "!bestshorthaul\n" +
                        "!bestmediumhaul\n" +
                        "!bestcargo\n" +
                        "!bestprofit\n" +
                        "!bestfuel\n" +
                        "!bestrange\n" +
                        "!bestcapacity\n" +
                        "!bestfleet\n" +
                        "!budgetplane\n" +
                        "!expensiveplane\n" +
                        "!cheapplane\n" +
                        "!fleettips\n" +
                        "!recommendcargo\n" +
                        "!recommendpassenger\n" +
                        "!recommendhub\n" +
                        "!recommendroute");








                //================ ROUTE COMMANDS =================//

            else if (msg.equals("!bestroute"))
                reply(event,"There is no single best route. Choose routes with high demand, good distance and aircraft compatibility.");

            else if (msg.equals("!hub"))
                reply(event,"A hub is your main airport. Choose one with high demand and enough slots.");

            else if (msg.equals("!besthub"))
                reply(event,"The best hub depends on your strategy. Popular hubs usually have strong passenger demand.");

            else if (msg.equals("!demand"))
                reply(event,"Demand shows how many passengers or cargo want to travel between two airports.");

            else if (msg.equals("!distance"))
                reply(event,"Always check if your aircraft has enough range before opening a route.");

            else if (msg.equals("!stopover"))
                reply(event,"If your aircraft can't reach the destination, use a stopover airport.");

            else if (msg.equals("!routeprofit"))
                reply(event,"Profit depends on demand, ticket price, fuel cost and aircraft efficiency.");

            else if (msg.equals("!longhaul"))
                reply(event,"Long-haul routes usually earn more but require expensive aircraft.");

            else if (msg.equals("!shorthaul"))
                reply(event,"Short-haul routes are cheaper to start and great for beginners.");

            else if (msg.equals("!mediumhaul"))
                reply(event,"Medium-haul routes balance investment and profit.");

            else if (msg.equals("!passengerdemand"))
                reply(event,"Higher passenger demand means you can fill more seats.");

            else if (msg.equals("!cargodemand"))
                reply(event,"Cargo demand is important when operating cargo aircraft.");

            else if (msg.equals("!hubchange"))
                reply(event,"Changing your hub can improve your airline if your current hub has low demand.");

            else if (msg.equals("!routeslots"))
                reply(event,"Every airport has limited slots. Manage them carefully.");

            else if (msg.equals("!routeincome"))
                reply(event,"Higher demand and better aircraft increase route income.");

            else if (msg.equals("!routecost"))
                reply(event,"Fuel, maintenance and staff salaries all affect route cost.");

            else if (msg.equals("!routelevel"))
                reply(event,"As your airline grows, you'll unlock better aircraft and more opportunities.");

            else if (msg.equals("!greenroute"))
                reply(event,"Green routes generally indicate good demand and healthy profitability.");

            else if (msg.equals("!redroute"))
                reply(event,"Red routes usually mean low demand or poor profitability.");

            else if (msg.equals("!goldroute"))
                reply(event,"Gold routes are considered premium and can generate excellent income.");

            else if (msg.equals("!routeplanning"))
                reply(event,"Plan routes based on demand, aircraft range and expected profit.");

            else if (msg.equals("!routeerror"))
                reply(event,"Double-check aircraft range, airport slots and demand before creating a route.");

            else if (msg.equals("!hubstrategy"))
                reply(event,"Build around one strong hub before expanding to multiple hubs.");

            else if (msg.equals("!profitablehub"))
                reply(event,"Choose hubs with strong demand, good location and enough expansion space.");

            else if (msg.equals("!routeexpand"))
                reply(event,"Expand only after your current routes become consistently profitable.");

                //================ AIRPLANE COMMANDS =================//

            else if (msg.equals("!bestplane"))
                reply(event,"There is no single best aircraft. Choose one based on your budget and route demand.");

            else if (msg.equals("!a380"))
                reply(event,"The Airbus A380 is ideal for very high-demand long-haul passenger routes.");

            else if (msg.equals("!b747"))
                reply(event,"The Boeing 747 is a reliable long-haul aircraft with excellent passenger capacity.");

            else if (msg.equals("!b737"))
                reply(event,"The Boeing 737 is one of the best aircraft for short and medium-haul routes.");

            else if (msg.equals("!a320"))
                reply(event,"The Airbus A320 is fuel efficient and perfect for short-haul operations.");

            else if (msg.equals("!a321"))
                reply(event,"The Airbus A321 offers more seats than the A320 and is great for busy routes.");

            else if (msg.equals("!a330"))
                reply(event,"The Airbus A330 is a solid choice for medium and long-haul flights.");

            else if (msg.equals("!a350"))
                reply(event,"The Airbus A350 is modern, fuel efficient and excellent for long-haul routes.");

            else if (msg.equals("!b777"))
                reply(event,"The Boeing 777 is a powerful long-haul aircraft with high passenger capacity.");

            else if (msg.equals("!b787"))
                reply(event,"The Boeing 787 Dreamliner is fuel efficient and ideal for long-distance flights.");

            else if (msg.equals("!il96"))
                reply(event,"The IL-96 is useful for some airlines but compare its operating costs before buying.");

            else if (msg.equals("!md11"))
                reply(event,"The MD-11 is mainly used for cargo operations.");

            else if (msg.equals("!concorde"))
                reply(event,"Concorde is famous for speed but not for making huge profits.");

            else if (msg.equals("!range"))
                reply(event,"Always check aircraft range before opening a route.");

            else if (msg.equals("!capacity"))
                reply(event,"Higher capacity can increase income if passenger demand is high.");

            else if (msg.equals("!fuel"))
                reply(event,"Fuel efficiency is one of the most important factors for long-term profit.");

            else if (msg.equals("!speed"))
                reply(event,"Faster aircraft can complete flights sooner but may have higher operating costs.");

            else if (msg.equals("!maintenance"))
                reply(event,"Maintain your aircraft regularly to avoid breakdowns and delays.");

            else if (msg.equals("!oldplane"))
                reply(event,"Older aircraft are usually cheaper but may consume more fuel.");

            else if (msg.equals("!newplane"))
                reply(event,"New aircraft generally offer better fuel efficiency and lower maintenance costs.");

            else if (msg.equals("!compare"))
                reply(event,"Compare aircraft by range, capacity, fuel usage and operating cost.");

            else if (msg.equals("!buyplane"))
                reply(event,"Only buy a new aircraft if your airline can afford the purchase and operating costs.");

            else if (msg.equals("!lease"))
                reply(event,"Leasing can help you expand without spending too much money at once.");

            else if (msg.equals("!passengerplane"))
                reply(event,"Passenger aircraft are designed to maximize seat capacity and revenue.");

            else if (msg.equals("!cargoplane"))
                reply(event,"Cargo aircraft are built to transport freight instead of passengers.");

                //================ AIRPLANE COMMANDS PART 2 =================//

            else if (msg.equals("!engine"))
                reply(event,"Choose aircraft with efficient engines to reduce fuel costs.");

            else if (msg.equals("!seat"))
                reply(event,"Configure seats based on route demand for maximum profit.");

            else if (msg.equals("!economy"))
                reply(event,"Economy class generates the highest passenger volume.");

            else if (msg.equals("!business"))
                reply(event,"Business class earns more per seat but has lower demand.");

            else if (msg.equals("!firstclass"))
                reply(event,"First Class is profitable only on premium high-demand routes.");

            else if (msg.equals("!fleet"))
                reply(event,"Keep a balanced fleet instead of buying random aircraft.");

            else if (msg.equals("!fleetvalue"))
                reply(event,"Fleet value is the total value of all your aircraft.");

            else if (msg.equals("!fleetsize"))
                reply(event,"Expand your fleet only when your airline can support it.");

            else if (msg.equals("!repair"))
                reply(event,"Repair aircraft before their condition becomes too low.");

            else if (msg.equals("!wear"))
                reply(event,"Aircraft wear increases after every flight.");

            else if (msg.equals("!checka"))
                reply(event,"A Check is a light maintenance inspection.");

            else if (msg.equals("!checkd"))
                reply(event,"D Check is the most expensive and complete aircraft inspection.");

            else if (msg.equals("!sellplane"))
                reply(event,"Sell aircraft only if they are no longer profitable.");

            else if (msg.equals("!upgradeplane"))
                reply(event,"Upgrade to newer aircraft when your income becomes stable.");

            else if (msg.equals("!planecost"))
                reply(event,"Never spend all your money on aircraft purchases.");

            else if (msg.equals("!planerange"))
                reply(event,"Aircraft range decides the maximum distance it can fly.");

            else if (msg.equals("!planespeed"))
                reply(event,"Higher speed means faster flights but not always higher profits.");

            else if (msg.equals("!planefuel"))
                reply(event,"Fuel efficiency is more important than top speed.");

            else if (msg.equals("!planeage"))
                reply(event,"Older aircraft usually require more maintenance.");

            else if (msg.equals("!aircraftmarket"))
                reply(event,"Watch the market before buying expensive aircraft.");

            else if (msg.equals("!planeprofit"))
                reply(event,"The best aircraft is the one that earns consistent profit.");

            else if (msg.equals("!planecompare"))
                reply(event,"Compare aircraft by range, fuel, capacity and maintenance costs.");

            else if (msg.equals("!passenger"))
                reply(event,"Passenger aircraft should match passenger demand.");

            else if (msg.equals("!cargo"))
                reply(event,"Cargo aircraft perform best on high cargo-demand routes.");

            else if (msg.equals("!favoriteplane"))
                reply(event,"There is no perfect aircraft—choose according to your airline strategy.");

                //================ AIRPORT COMMANDS =================//

            else if (msg.equals("!bestairport"))
                reply(event,"The best airport depends on demand, slots and your airline strategy.");

            else if (msg.equals("!hubairport"))
                reply(event,"A hub airport should have high demand and enough slots for expansion.");

            else if (msg.equals("!slots"))
                reply(event,"Airport slots limit how many flights you can operate.");

            else if (msg.equals("!runway"))
                reply(event,"Large aircraft require airports with suitable runways.");

            else if (msg.equals("!terminal"))
                reply(event,"Higher level terminals improve airport operations.");

            else if (msg.equals("!smallairport"))
                reply(event,"Small airports are cheaper but usually have lower demand.");

            else if (msg.equals("!largeairport"))
                reply(event,"Large airports offer more demand but are often more competitive.");

            else if (msg.equals("!international"))
                reply(event,"International airports usually support more profitable long-haul routes.");

            else if (msg.equals("!domestic"))
                reply(event,"Domestic airports are perfect for short-haul operations.");

            else if (msg.equals("!airportdemand"))
                reply(event,"Higher airport demand means more passengers and better profits.");

            else if (msg.equals("!airportlevel"))
                reply(event,"Higher airport levels unlock more opportunities.");

            else if (msg.equals("!airportincome"))
                reply(event,"A good airport increases your airline's overall income.");

            else if (msg.equals("!airportprofit"))
                reply(event,"Profit depends on both the airport and your route planning.");

            else if (msg.equals("!airportcost"))
                reply(event,"Always balance airport costs with expected earnings.");

            else if (msg.equals("!airportchoice"))
                reply(event,"Choose airports based on demand, location and aircraft compatibility.");

            else if (msg.equals("!airportupgrade"))
                reply(event,"Upgrade airports only when your airline can afford it.");

            else if (msg.equals("!airportdistance"))
                reply(event,"Airport distance affects aircraft selection and fuel usage.");

            else if (msg.equals("!airporttraffic"))
                reply(event,"Busy airports usually provide better passenger demand.");

            else if (msg.equals("!airportstrategy"))
                reply(event,"Expand slowly instead of opening too many airports at once.");

            else if (msg.equals("!airporttips"))
                reply(event,"Focus on high-demand airports before expanding worldwide.");

            else if (msg.equals("!airportrank"))
                reply(event,"Airport rankings can help you choose better locations.");

            else if (msg.equals("!airportcapacity"))
                reply(event,"Airport capacity determines how much traffic it can handle.");

            else if (msg.equals("!airporthub"))
                reply(event,"A strong hub is the foundation of a successful airline.");

            else if (msg.equals("!airportexpansion"))
                reply(event,"Expand only after your current airport becomes consistently profitable.");

            else if (msg.equals("!airporthelp"))
                reply(event,"Choose airports with strong demand, enough slots and good route connections.");

                //================ FINANCE COMMANDS =================//

            else if (msg.equals("!loan"))
                reply(event,"Take loans only if you're sure you can repay them with future profits.");

            else if (msg.equals("!profit"))
                reply(event,"Profit = Income - Expenses.");

            else if (msg.equals("!income"))
                reply(event,"Increase income by flying profitable routes and maintaining high demand.");

            else if (msg.equals("!expenses"))
                reply(event,"Expenses include fuel, maintenance, staff salaries and loan payments.");

            else if (msg.equals("!fuelcost"))
                reply(event,"Fuel costs are one of the biggest expenses. Use fuel-efficient aircraft.");

            else if (msg.equals("!maintenancecost"))
                reply(event,"Ignoring maintenance can cost more than repairing your aircraft on time.");

            else if (msg.equals("!salary"))
                reply(event,"Staff salaries are necessary, but don't hire more staff than needed.");

            else if (msg.equals("!cash"))
                reply(event,"Always keep emergency cash for unexpected expenses.");

            else if (msg.equals("!money"))
                reply(event,"Don't spend all your money on new aircraft.");

            else if (msg.equals("!investment"))
                reply(event,"Invest in routes that provide stable long-term profits.");

            else if (msg.equals("!bank"))
                reply(event,"The bank helps with loans, but borrowed money must be repaid.");

            else if (msg.equals("!debt"))
                reply(event,"Too much debt can slow down your airline's growth.");

            else if (msg.equals("!dailyprofit"))
                reply(event,"Check your daily profit before making expensive purchases.");

            else if (msg.equals("!weeklyprofit"))
                reply(event,"Weekly profit shows whether your airline is growing consistently.");

            else if (msg.equals("!loss"))
                reply(event,"Reduce losses by closing unprofitable routes.");

            else if (msg.equals("!fuel"))
                reply(event,"Buy fuel carefully and avoid unnecessary fuel expenses.");

            else if (msg.equals("!growth"))
                reply(event,"Expand only when your airline earns stable profits.");

            else if (msg.equals("!budget"))
                reply(event,"Always create a budget before buying aircraft or opening routes.");

            else if (msg.equals("!saving"))
                reply(event,"Saving money is just as important as earning it.");

            else if (msg.equals("!rich"))
                reply(event,"The fastest way to become rich is by making smart business decisions.");

            else if (msg.equals("!economy"))
                reply(event,"A healthy economy helps your airline grow faster.");

            else if (msg.equals("!ticketprice"))
                reply(event,"Choose ticket prices carefully to balance demand and profit.");

            else if (msg.equals("!financialtips"))
                reply(event,"Spend wisely, earn consistently and avoid unnecessary loans.");

            else if (msg.equals("!airlinevalue"))
                reply(event,"Your airline value increases as your fleet and profits grow.");

            else if (msg.equals("!financehelp"))
                reply(event,"Focus on profit first, expansion second.");

                //================ FINANCE COMMANDS PART 2 =================//

            else if (msg.equals("!loanlimit"))
                reply(event,"Never take the maximum loan unless you have a solid expansion plan.");

            else if (msg.equals("!repayloan"))
                reply(event,"Repay loans as early as possible to reduce interest costs.");

            else if (msg.equals("!interest"))
                reply(event,"Higher loans usually mean higher interest payments.");

            else if (msg.equals("!fuelstrategy"))
                reply(event,"Use fuel-efficient aircraft to reduce long-term operating costs.");

            else if (msg.equals("!maintenanceplan"))
                reply(event,"Schedule maintenance regularly to avoid expensive repairs.");

            else if (msg.equals("!cashflow"))
                reply(event,"Positive cash flow keeps your airline growing steadily.");

            else if (msg.equals("!breakingeven"))
                reply(event,"Break-even is when your income equals your expenses.");

            else if (msg.equals("!expansion"))
                reply(event,"Expand only after your current airline is consistently profitable.");

            else if (msg.equals("!aircraftcost"))
                reply(event,"Consider purchase price, fuel and maintenance before buying an aircraft.");

            else if (msg.equals("!routecost"))
                reply(event,"Every route has operating costs. Don't focus only on revenue.");

            else if (msg.equals("!reservecash"))
                reply(event,"Always keep reserve money for emergencies.");

            else if (msg.equals("!smartspending"))
                reply(event,"Spend money where it improves long-term profit.");

            else if (msg.equals("!bankruptcy"))
                reply(event,"Avoid overspending and excessive debt to prevent bankruptcy.");

            else if (msg.equals("!fleetbudget"))
                reply(event,"Grow your fleet gradually instead of buying many aircraft at once.");

            else if (msg.equals("!highprofit"))
                reply(event,"High-demand routes with efficient aircraft usually generate the best profits.");

            else if (msg.equals("!financialmistake"))
                reply(event,"The biggest mistake is expanding too quickly without stable income.");

            else if (msg.equals("!dailyincome"))
                reply(event,"Track your daily income to measure airline performance.");

            else if (msg.equals("!bestinvestment"))
                reply(event,"Profitable routes are usually the best investment.");

            else if (msg.equals("!cashreserve"))
                reply(event,"A healthy cash reserve protects your airline during losses.");

            else if (msg.equals("!airlinegrowth"))
                reply(event,"Steady growth is better than risky expansion.");

            else if (msg.equals("!moneymanagement"))
                reply(event,"Manage every dollar wisely. Small savings become big profits.");

            else if (msg.equals("!financialgoal"))
                reply(event,"Focus on building a stable and profitable airline before rapid expansion.");

            else if (msg.equals("!profittips"))
                reply(event,"Increase demand, reduce costs and keep your fleet efficient.");

            else if (msg.equals("!smartloan"))
                reply(event,"Use loans as a tool, not as your main source of money.");

            else if (msg.equals("!financialsuccess"))
                reply(event,"Successful airlines grow with planning, patience and smart investments.");

                //================ GAMEPLAY COMMANDS =================//

            else if (msg.equals("!reputation"))
                reply(event,"Higher reputation increases passenger demand and airline performance.");

            else if (msg.equals("!maintenance"))
                reply(event,"Maintain aircraft regularly to avoid delays and breakdowns.");

            else if (msg.equals("!staff"))
                reply(event,"Hire enough staff to keep your airline running efficiently.");

            else if (msg.equals("!training"))
                reply(event,"Staff training improves airline performance and efficiency.");

            else if (msg.equals("!level"))
                reply(event,"Complete flights and grow your airline to level up.");

            else if (msg.equals("!xp"))
                reply(event,"XP is earned by expanding and managing your airline successfully.");

            else if (msg.equals("!achievement"))
                reply(event,"Achievements reward active and successful players.");

            else if (msg.equals("!daily"))
                reply(event,"Log in daily to manage your airline and collect rewards if available.");

            else if (msg.equals("!event"))
                reply(event,"Participate in events for special rewards and bonuses.");

            else if (msg.equals("!bonus"))
                reply(event,"Bonuses help increase income or reduce operating costs.");

            else if (msg.equals("!contract"))
                reply(event,"Complete contracts to earn additional rewards.");

            else if (msg.equals("!mission"))
                reply(event,"Finish missions to gain experience and useful rewards.");

            else if (msg.equals("!gamehelp"))
                reply(event,"Focus on profitable routes, efficient aircraft and good reputation.");

            else if (msg.equals("!beginner"))
                reply(event,"Start with cheaper aircraft and expand slowly.");

            else if (msg.equals("!advanced"))
                reply(event,"Experienced players should optimize routes and fleet efficiency.");

            else if (msg.equals("!ranking"))
                reply(event,"Your ranking improves as your airline grows.");

            else if (msg.equals("!airline"))
                reply(event,"Grow your airline step by step instead of expanding too fast.");

            else if (msg.equals("!growthtips"))
                reply(event,"Invest in profitable routes before buying more aircraft.");

            else if (msg.equals("!strategy"))
                reply(event,"A smart strategy is more important than having expensive aircraft.");

            else if (msg.equals("!protips"))
                reply(event,"Keep high reputation, maintain aircraft and monitor your finances.");

            else if (msg.equals("!mistakes"))
                reply(event,"Avoid buying too many aircraft without enough profit.");

            else if (msg.equals("!success"))
                reply(event,"Patience and smart planning are the keys to a successful airline.");

            else if (msg.equals("!playstyle"))
                reply(event,"Choose a strategy that matches your budget and long-term goals.");

            else if (msg.equals("!airlinetips"))
                reply(event,"Expand only when your existing routes are consistently profitable.");

            else if (msg.equals("!faq"))
                reply(event,"Use !am4 to see all available AM4 command categories.");

            else if (msg.equals("!reputation"))
                reply(event,"Keep your reputation close to 100% to maximize passenger demand.");

            else if (msg.equals("!checka"))
                reply(event,"A Check is a light maintenance check. Do it regularly.");

            else if (msg.equals("!checkd"))
                reply(event,"D Check restores aircraft condition but costs much more than an A Check.");

            else if (msg.equals("!wear"))
                reply(event,"Aircraft wear increases after every flight. Monitor it to avoid expensive repairs.");

            else if (msg.equals("!repair"))
                reply(event,"Repair aircraft before wear becomes too high.");

            else if (msg.equals("!co2"))
                reply(event,"Lower CO₂ emissions help improve your airline's eco performance.");

            else if (msg.equals("!fuelprice"))
                reply(event,"Buy fuel when the market price is low to save money.");

            else if (msg.equals("!marketing"))
                reply(event,"Marketing increases your airline's reputation for a limited time.");

            else if (msg.equals("!ipo"))
                reply(event,"IPO lets players sell shares of their airline after meeting the requirements.");

            else if (msg.equals("!share"))
                reply(event,"Shares are related to the IPO system and company valuation.");

            else if (msg.equals("!fleet"))
                reply(event,"A balanced fleet is usually more profitable than buying random aircraft.");

            else if (msg.equals("!incident"))
                reply(event,"Ignoring maintenance increases the risk of incidents.");

            else if (msg.equals("!achievements"))
                reply(event,"Achievements reward players for reaching important milestones.");

            else if (msg.equals("!gamemode"))
                reply(event,"AM4 offers Easy and Realism modes with different gameplay mechanics.");

            else if (msg.equals("!realism"))
                reply(event,"Realism mode includes more realistic flight times and aircraft operations.");

            else if (msg.equals("!easy"))
                reply(event,"Easy mode is faster and more beginner-friendly.");

            else if (msg.equals("!licenses"))
                reply(event,"Purchase licenses to unlock more aircraft.");

            else if (msg.equals("!fleetage"))
                reply(event,"Older aircraft generally require more maintenance.");

            else if (msg.equals("!training"))
                reply(event,"Staff training improves airline efficiency.");

            else if (msg.equals("!staff"))
                reply(event,"Having enough staff helps keep your airline running smoothly.");

                //================ CARGO COMMANDS =================//

            else if (msg.equals("!cargo"))
                reply(event,"Cargo flights transport freight instead of passengers.");

            else if (msg.equals("!cargohub"))
                reply(event,"Choose a cargo hub with high cargo demand for better profits.");

            else if (msg.equals("!cargodemand"))
                reply(event,"Higher cargo demand means you can transport more freight and earn more.");

            else if (msg.equals("!cargoplane"))
                reply(event,"Use dedicated cargo aircraft for maximum cargo efficiency.");

            else if (msg.equals("!cargoaircraft"))
                reply(event,"Aircraft like the B747F and AN-124 are commonly used for cargo operations.");

            else if (msg.equals("!cargoincome"))
                reply(event,"Cargo income depends on demand, aircraft capacity and flight distance.");

            else if (msg.equals("!cargoprofit"))
                reply(event,"Operate profitable cargo routes with high demand and efficient aircraft.");

            else if (msg.equals("!cargofuel"))
                reply(event,"Fuel-efficient cargo aircraft reduce operating costs.");

            else if (msg.equals("!cargofleet"))
                reply(event,"Build your cargo fleet gradually based on your airline's finances.");

            else if (msg.equals("!cargoexpand"))
                reply(event,"Expand cargo operations only after existing routes become profitable.");

            else if (msg.equals("!cargohelp"))
                reply(event,"Focus on high-demand cargo routes, efficient aircraft and low operating costs.");

            else if (msg.equals("!freight"))
                reply(event,"Freight is the cargo transported between airports.");

            else if (msg.equals("!heavycargo"))
                reply(event,"Heavy cargo requires aircraft with high payload capacity.");

            else if (msg.equals("!lightcargo"))
                reply(event,"Light cargo can be transported by smaller cargo aircraft.");

            else if (msg.equals("!payload"))
                reply(event,"Payload is the maximum cargo weight an aircraft can carry.");

            else if (msg.equals("!cargostrategy"))
                reply(event,"Choose routes that maximize payload utilization and profit.");

            else if (msg.equals("!cargoairport"))
                reply(event,"Cargo airports with strong demand are ideal for freight operations.");

            else if (msg.equals("!cargolevel"))
                reply(event,"Expand your cargo network as your airline grows.");

            else if (msg.equals("!cargofleettips"))
                reply(event,"Avoid buying too many cargo aircraft too early.");

            else if (msg.equals("!cargofaq"))
                reply(event,"Use aircraft with high payload and operate routes with strong cargo demand.");

                //================ ALLIANCE COMMANDS =================//

            else if (msg.equals("!alliance"))
                reply(event,"An alliance is a group of airlines working together for rankings and teamwork.");

            else if (msg.equals("!joinalliance"))
                reply(event,"Join an active alliance with good activity and experienced members.");

            else if (msg.equals("!leavealliance"))
                reply(event,"You can leave an alliance anytime, but check for any cooldowns or alliance rules.");

            else if (msg.equals("!bestalliance"))
                reply(event,"The best alliance is one that is active, supportive and highly ranked.");

            else if (msg.equals("!alliancerank"))
                reply(event,"Alliance rank depends on the combined performance of all members.");

            else if (msg.equals("!alliancebonus"))
                reply(event,"Some alliances organize events, training and support for members.");

            else if (msg.equals("!alliancerequirements"))
                reply(event,"Many alliances require a minimum airline rank, reputation or daily activity.");

            else if (msg.equals("!alliancechat"))
                reply(event,"Use alliance chat to ask questions, share routes and help teammates.");

            else if (msg.equals("!contribution"))
                reply(event,"Stay active and contribute to help your alliance grow.");

            else if (msg.equals("!activity"))
                reply(event,"Inactive players may be removed from competitive alliances.");

            else if (msg.equals("!donation"))
                reply(event,"Some alliances ask members to contribute according to their own rules.");

            else if (msg.equals("!recruitment"))
                reply(event,"Recruit active players who want to grow and participate regularly.");

            else if (msg.equals("!allianceowner"))
                reply(event,"The alliance owner manages rules, promotions and member invitations.");

            else if (msg.equals("!allianceadmin"))
                reply(event,"Alliance admins help manage members and keep the alliance active.");

            else if (msg.equals("!promotion"))
                reply(event,"Promotions depend on the alliance's internal rules and your contribution.");

            else if (msg.equals("!kick"))
                reply(event,"Inactive or rule-breaking members may be removed by alliance management.");

            else if (msg.equals("!allianceevent"))
                reply(event,"Many alliances host internal competitions and training events.");

            else if (msg.equals("!discord"))
                reply(event,"Most top alliances use Discord for communication and coordination.");

            else if (msg.equals("!teamwork"))
                reply(event,"Good teamwork is one of the biggest strengths of a successful alliance.");

            else if (msg.equals("!alliancehelp"))
                reply(event,"Be active, follow alliance rules and support your teammates to succeed.");

                //================ STAFF & REPUTATION COMMANDS =================//

            else if (msg.equals("!staff"))
                reply(event,"Staff are essential for keeping your airline running efficiently.");

            else if (msg.equals("!pilots"))
                reply(event,"Pilots are required to operate your aircraft.");

            else if (msg.equals("!crew"))
                reply(event,"Cabin crew improve passenger experience during flights.");

            else if (msg.equals("!engineers"))
                reply(event,"Engineers help maintain your aircraft and reduce operational issues.");

            else if (msg.equals("!stafftraining"))
                reply(event,"Training your staff improves airline performance.");

            else if (msg.equals("!staffsalary"))
                reply(event,"Always make sure your staff are paid to keep operations running smoothly.");

            else if (msg.equals("!hirestaff"))
                reply(event,"Hire enough staff before expanding your fleet.");

            else if (msg.equals("!staffratio"))
                reply(event,"Keep your staff numbers balanced with your fleet size.");

            else if (msg.equals("!stafftips"))
                reply(event,"Don't overhire or underhire. Balance is the key.");

            else if (msg.equals("!staffhelp"))
                reply(event,"Increase staff as your airline grows.");

            else if (msg.equals("!reputation"))
                reply(event,"Higher reputation increases passenger demand.");

            else if (msg.equals("!100reputation"))
                reply(event,"Keeping your reputation close to 100% helps maximize profits.");

            else if (msg.equals("!marketing"))
                reply(event,"Marketing campaigns temporarily increase your reputation.");

            else if (msg.equals("!lowreputation"))
                reply(event,"Low reputation reduces passenger demand and income.");

            else if (msg.equals("!reputationtips"))
                reply(event,"Maintain aircraft, use marketing and avoid delays to keep reputation high.");

            else if (msg.equals("!reputationloss"))
                reply(event,"Poor maintenance and operational problems can reduce reputation.");

            else if (msg.equals("!reputationgain"))
                reply(event,"Regular marketing and good airline management improve reputation.");

            else if (msg.equals("!maintainrep"))
                reply(event,"Monitor your reputation daily and refresh marketing when needed.");

            else if (msg.equals("!rephelp"))
                reply(event,"High reputation means more passengers and better profits.");

            else if (msg.equals("!airlinerating"))
                reply(event,"A successful airline keeps both reputation and profits high.");

                //================ FUEL & MAINTENANCE COMMANDS =================//

            else if (msg.equals("!fuel"))
                reply(event,"Fuel is one of the biggest operating costs. Buy it when prices are low.");

            else if (msg.equals("!fuelprice"))
                reply(event,"Check the fuel market regularly and purchase when prices drop.");

            else if (msg.equals("!buyfuel"))
                reply(event,"Stock up on fuel during low prices to reduce future expenses.");

            else if (msg.equals("!fueltank"))
                reply(event,"Keep enough fuel in storage to avoid buying at expensive prices.");

            else if (msg.equals("!fueltips"))
                reply(event,"Never panic-buy fuel. Wait for a better market price if possible.");

            else if (msg.equals("!maintenance"))
                reply(event,"Regular maintenance keeps your aircraft safe and reliable.");

            else if (msg.equals("!acheck"))
                reply(event,"A Check is a quick maintenance inspection. Perform it regularly.");

            else if (msg.equals("!dcheck"))
                reply(event,"D Check is a complete aircraft inspection. It costs more but fully restores the aircraft.");

            else if (msg.equals("!wear"))
                reply(event,"Aircraft wear increases after every flight. Monitor it carefully.");

            else if (msg.equals("!condition"))
                reply(event,"Low aircraft condition increases maintenance needs and operational risks.");

            else if (msg.equals("!repair"))
                reply(event,"Repair your aircraft before wear becomes too high.");

            else if (msg.equals("!breakdown"))
                reply(event,"Skipping maintenance increases the chance of aircraft problems.");

            else if (msg.equals("!service"))
                reply(event,"Keep every aircraft serviced on time for maximum efficiency.");

            else if (msg.equals("!hangar"))
                reply(event,"The hangar is where maintenance and repairs are managed.");

            else if (msg.equals("!maintenancecost"))
                reply(event,"Preventive maintenance is usually cheaper than fixing major problems.");

            else if (msg.equals("!maintenancetips"))
                reply(event,"Don't wait until aircraft are badly worn. Schedule maintenance early.");

            else if (msg.equals("!aircrafthealth"))
                reply(event,"Healthy aircraft reduce delays and improve airline performance.");

            else if (msg.equals("!inspection"))
                reply(event,"Frequent inspections help keep your fleet in excellent condition.");

            else if (msg.equals("!fuelstrategy"))
                reply(event,"Smart fuel buying saves millions over time.");

            else if (msg.equals("!maintenancehelp"))
                reply(event,"A healthy fleet means a profitable airline.");

                //================ AM4 FAQ COMMANDS =================//

            else if (msg.equals("!howtostart"))
                reply(event,"Start with cheap aircraft, open profitable routes and avoid overspending.");

            else if (msg.equals("!firstplane"))
                reply(event,"Choose a fuel-efficient aircraft that matches your budget.");

            else if (msg.equals("!firsthub"))
                reply(event,"Select a hub with strong passenger demand and good route options.");

            else if (msg.equals("!beststarter"))
                reply(event,"Grow slowly. Don't buy expensive aircraft too early.");

            else if (msg.equals("!howtoearn"))
                reply(event,"Earn money by flying profitable routes with high demand.");

            else if (msg.equals("!howtogrow"))
                reply(event,"Increase profits first, then expand your fleet.");

            else if (msg.equals("!beststrategy"))
                reply(event,"Build a stable airline before expanding aggressively.");

            else if (msg.equals("!moneytips"))
                reply(event,"Don't waste money. Save for better aircraft and profitable routes.");

            else if (msg.equals("!expansiontips"))
                reply(event,"Expand only when your current routes are consistently profitable.");

            else if (msg.equals("!aircrafttips"))
                reply(event,"Always compare range, fuel efficiency and capacity before buying.");

            else if (msg.equals("!hubtips"))
                reply(event,"Your hub is your airline's foundation. Choose it wisely.");

            else if (msg.equals("!routetips"))
                reply(event,"High demand + correct aircraft = better profits.");

            else if (msg.equals("!maintenancetips"))
                reply(event,"Never ignore aircraft maintenance.");

            else if (msg.equals("!reputationtips"))
                reply(event,"Keep your reputation near 100% using marketing.");

            else if (msg.equals("!loanhelp"))
                reply(event,"Only take loans when you have a clear repayment plan.");

            else if (msg.equals("!profithelp"))
                reply(event,"Reduce costs before trying to increase revenue.");

            else if (msg.equals("!fueltips"))
                reply(event,"Buy fuel when prices are low and stock it.");

            else if (msg.equals("!fleettips"))
                reply(event,"A balanced fleet performs better than random aircraft purchases.");

            else if (msg.equals("!newplayer"))
                reply(event,"Welcome to AM4! Focus on learning before expanding.");

            else if (msg.equals("!am4help"))
                reply(event,"Type !am4 to see every available AM4 category.");

                //================ COMPARE COMMANDS =================//

            else if (msg.equals("!compare"))
                reply(event,
                        "✈️ Aircraft Compare\n\n" +
                                "!comparea380b747\n" +
                                "!comparea350b787\n" +
                                "!comparea320b737\n" +
                                "!comparea321b757\n" +
                                "!compareb777a350\n" +
                                "!comparemd11b747f\n" +
                                "!comparean124b747f\n" +
                                "!compare7478a380\n" +
                                "!comparecargo\n" +
                                "!comparepassenger");

            else if (msg.equals("!comparea380b747"))
                reply(event,"A380 has more passenger capacity, while the B747 is usually more flexible and cheaper to operate.");

            else if (msg.equals("!comparea350b787"))
                reply(event,"Both are fuel-efficient. The A350 offers more capacity, while the B787 is excellent for medium and long-haul routes.");

            else if (msg.equals("!comparea320b737"))
                reply(event,"Both are great short-haul aircraft. Compare price, fuel usage and capacity before buying.");

            else if (msg.equals("!comparea321b757"))
                reply(event,"The A321 is fuel efficient, while the B757 offers higher performance on some routes.");

            else if (msg.equals("!compareb777a350"))
                reply(event,"The B777 has higher capacity, while the A350 is generally more fuel efficient.");

            else if (msg.equals("!comparemd11b747f"))
                reply(event,"The B747F carries more cargo, while the MD-11F is cheaper for some airlines.");

            else if (msg.equals("!comparean124b747f"))
                reply(event,"The AN-124 offers massive cargo capacity, while the B747F is often more practical for regular operations.");

            else if (msg.equals("!compare7478a380"))
                reply(event,"The B747-8 is easier to fill on many routes, while the A380 needs extremely high demand.");

            else if (msg.equals("!comparecargo"))
                reply(event,"Compare cargo aircraft by payload, range, fuel usage and operating costs.");

            else if (msg.equals("!comparepassenger"))
                reply(event,"Compare passenger aircraft by capacity, range, fuel efficiency and purchase price.");

                //================ COMPARE COMMANDS PART 2 =================//

            else if (msg.equals("!comparea330a350"))
                reply(event,"The A350 is newer and more fuel efficient, while the A330 is cheaper to purchase.");

            else if (msg.equals("!compare777787"))
                reply(event,"The B777 carries more passengers, while the B787 offers better fuel efficiency.");

            else if (msg.equals("!compare747777"))
                reply(event,"The B747 has higher capacity, while the B777 is more economical on many routes.");

            else if (msg.equals("!compare747380"))
                reply(event,"The A380 carries more passengers, but the B747 is easier to fill on most routes.");

            else if (msg.equals("!compareil96a330"))
                reply(event,"The A330 is generally more fuel efficient, while the IL-96 is usually cheaper.");

            else if (msg.equals("!compareconcordea380"))
                reply(event,"Concorde is built for speed, while the A380 is built for passenger capacity and profit.");

            else if (msg.equals("!comparedc10md11"))
                reply(event,"The MD-11 is an improved version of the DC-10 with better performance.");

            else if (msg.equals("!compareatrq400"))
                reply(event,"The Q400 is faster, while the ATR is more fuel efficient on short regional routes.");

            else if (msg.equals("!comparea220e195"))
                reply(event,"The A220 has better range, while the E195 is a strong regional aircraft.");

            else if (msg.equals("!comparemaxneo"))
                reply(event,"The 737 MAX and A320neo are both excellent. Compare fuel use, range and purchase price.");

            else if (msg.equals("!compare7478a350"))
                reply(event,"The B747-8 offers higher capacity, while the A350 is more fuel efficient.");

            else if (msg.equals("!comparea321neo737max"))
                reply(event,"Both aircraft are excellent for medium-haul routes. Choose based on your airline strategy.");

            else if (msg.equals("!comparecargo747an124"))
                reply(event,"The AN-124 carries heavier cargo, while the B747F is usually better for regular freight routes.");

            else if (msg.equals("!comparelonghaul"))
                reply(event,"For long-haul routes, compare aircraft by range, fuel efficiency and passenger demand.");

            else if (msg.equals("!compareshorthaul"))
                reply(event,"For short-haul routes, focus on fuel efficiency and operating costs.");

            else if (msg.equals("!comparecapacity"))
                reply(event,"Higher capacity is only useful if your route has enough demand.");

            else if (msg.equals("!comparefuel"))
                reply(event,"Fuel-efficient aircraft usually generate better long-term profits.");

            else if (msg.equals("!comparerange"))
                reply(event,"Always compare maximum range before opening a new route.");

            else if (msg.equals("!compareprice"))
                reply(event,"A cheaper aircraft isn't always the best. Consider operating costs too.");

            else if (msg.equals("!compareprofit"))
                reply(event,"The most profitable aircraft depends on demand, distance and operating costs.");

                //================ AIRCRAFT RECOMMENDATION COMMANDS =================//

            else if (msg.equals("!recommend"))
                reply(event,"Tell me your budget or route type to get a better recommendation.");

            else if (msg.equals("!beststarterplane"))
                reply(event,"Start with a fuel-efficient aircraft that matches your budget and route demand.");

            else if (msg.equals("!bestlonghaul"))
                reply(event,"Choose a long-range aircraft with good fuel efficiency and strong passenger capacity.");

            else if (msg.equals("!bestshorthaul"))
                reply(event,"Choose a fuel-efficient narrow-body aircraft for short routes.");

            else if (msg.equals("!bestmediumhaul"))
                reply(event,"Medium-range aircraft offer a great balance between cost and profit.");

            else if (msg.equals("!bestcargo"))
                reply(event,"Choose a cargo aircraft based on payload, range and operating costs.");

            else if (msg.equals("!bestprofit"))
                reply(event,"The most profitable aircraft depends on your routes, demand and airline strategy.");

            else if (msg.equals("!bestfuel"))
                reply(event,"Fuel-efficient aircraft save money over thousands of flights.");

            else if (msg.equals("!bestrange"))
                reply(event,"Always buy an aircraft with enough range for your planned routes.");

            else if (msg.equals("!bestcapacity"))
                reply(event,"High capacity is only useful when passenger demand is high.");

            else if (msg.equals("!bestfleet"))
                reply(event,"Build a balanced fleet instead of buying only one aircraft type.");

            else if (msg.equals("!budgetplane"))
                reply(event,"Don't buy the most expensive aircraft. Buy the one your airline can support.");

            else if (msg.equals("!expensiveplane"))
                reply(event,"Expensive aircraft are worth it only if you can keep them profitable.");

            else if (msg.equals("!cheapplane"))
                reply(event,"Cheap aircraft help new airlines grow with lower financial risk.");

            else if (msg.equals("!fleettips"))
                reply(event,"Expand your fleet step by step instead of buying many aircraft at once.");

            else if (msg.equals("!recommendcargo"))
                reply(event,"Use dedicated cargo aircraft for high cargo-demand routes.");

            else if (msg.equals("!recommendpassenger"))
                reply(event,"Choose passenger aircraft according to route demand and distance.");

            else if (msg.equals("!recommendhub"))
                reply(event,"Choose aircraft that match the demand and distance from your hub.");

            else if (msg.equals("!recommendroute"))
                reply(event,"Always match the aircraft to the route, not the route to the aircraft.");

            else if (msg.equals("!recommendhelp"))
                reply(event,"A good airline succeeds by choosing the right aircraft for the right job.");

                //================ AIRCRAFT INFO COMMANDS =================//

            else if (msg.equals("!a380info"))
                reply(event,"✈ Airbus A380\nRole: Passenger\nBest For: Ultra high-demand long-haul routes.");

            else if (msg.equals("!b747info"))
                reply(event,"✈ Boeing 747\nRole: Passenger/Cargo\nBest For: Long-haul operations.");

            else if (msg.equals("!a350info"))
                reply(event,"✈ Airbus A350\nRole: Passenger\nBest For: Fuel-efficient long-haul flights.");

            else if (msg.equals("!b787info"))
                reply(event,"✈ Boeing 787 Dreamliner\nRole: Passenger\nBest For: Long-range, fuel-efficient routes.");

            else if (msg.equals("!b777info"))
                reply(event,"✈ Boeing 777\nRole: Passenger\nBest For: High-capacity long-haul routes.");

            else if (msg.equals("!a330info"))
                reply(event,"✈ Airbus A330\nRole: Passenger\nBest For: Medium and long-haul routes.");

            else if (msg.equals("!a320info"))
                reply(event,"✈ Airbus A320\nRole: Passenger\nBest For: Short-haul routes.");

            else if (msg.equals("!a321info"))
                reply(event,"✈ Airbus A321\nRole: Passenger\nBest For: Busy medium-haul routes.");

            else if (msg.equals("!b737info"))
                reply(event,"✈ Boeing 737\nRole: Passenger\nBest For: Short and medium-haul routes.");

            else if (msg.equals("!md11info"))
                reply(event,"✈ MD-11\nRole: Cargo\nBest For: Freight operations.");

            else if (msg.equals("!an124info"))
                reply(event,"✈ Antonov AN-124\nRole: Cargo\nBest For: Heavy cargo transport.");

            else if (msg.equals("!concordeinfo"))
                reply(event,"✈ Concorde\nRole: Supersonic Passenger\nBest For: Speed, not maximum profit.");

            else if (msg.equals("!il96info"))
                reply(event,"✈ IL-96\nRole: Passenger\nBest For: Budget long-haul airlines.");

            else if (msg.equals("!dc10info"))
                reply(event,"✈ DC-10\nRole: Passenger\nBest For: Older generation long-haul operations.");

            else if (msg.equals("!atr72info"))
                reply(event,"✈ ATR 72\nRole: Regional Passenger\nBest For: Short regional flights.");

            else if (msg.equals("!q400info"))
                reply(event,"✈ Dash 8 Q400\nRole: Regional Passenger\nBest For: Fast regional operations.");

            else if (msg.equals("!a220info"))
                reply(event,"✈ Airbus A220\nRole: Passenger\nBest For: Regional and medium-haul routes.");

            else if (msg.equals("!e195info"))
                reply(event,"✈ Embraer E195\nRole: Passenger\nBest For: Regional airline operations.");

            else if (msg.equals("!7478info"))
                reply(event,"✈ Boeing 747-8\nRole: Passenger/Cargo\nBest For: Long-haul high-capacity flights.");

            else if (msg.equals("!aircrafthelp"))
                reply(event,"Use commands like !a380info, !b787info, !a350info, !b737info and more.");

                //================ COMPARE COMMANDS PART 3 =================//

            else if (msg.equals("!comparea340b777"))
                reply(event,"The B777 is generally more fuel efficient, while the A340 has four engines and higher fuel consumption.");

            else if (msg.equals("!comparea330b767"))
                reply(event,"The A330 offers better capacity, while the B767 is cheaper for some routes.");

            else if (msg.equals("!comparea321a320"))
                reply(event,"The A321 has more seats, while the A320 is cheaper and great for lower demand routes.");

            else if (msg.equals("!compare737700737800"))
                reply(event,"The B737-800 carries more passengers, while the B737-700 is suitable for smaller markets.");

            else if (msg.equals("!compare737800737max8"))
                reply(event,"The 737 MAX 8 is more fuel efficient than the 737-800.");

            else if (msg.equals("!comparea320neoa320"))
                reply(event,"The A320neo offers better fuel efficiency than the standard A320.");

            else if (msg.equals("!comparea321neob737max9"))
                reply(event,"Both are excellent narrow-body aircraft. Choose based on route demand and operating costs.");

            else if (msg.equals("!comparea220a320"))
                reply(event,"The A220 is ideal for regional routes, while the A320 handles higher demand.");

            else if (msg.equals("!comparee195a220"))
                reply(event,"The A220 has better range, while the E195 is a strong regional jet.");

            else if (msg.equals("!compareatr72q400"))
                reply(event,"The ATR 72 is more fuel efficient, while the Q400 is faster.");

            else if (msg.equals("!comparecargo747md11"))
                reply(event,"The B747F carries more cargo, while the MD-11F has lower operating costs.");

            else if (msg.equals("!comparecargoan225an124"))
                reply(event,"The AN-225 carries more cargo, while the AN-124 is more practical for daily operations.");

            else if (msg.equals("!comparea380a350"))
                reply(event,"The A380 needs extremely high demand, while the A350 is easier to operate profitably.");

            else if (msg.equals("!compareb787a330"))
                reply(event,"The B787 is more fuel efficient, while the A330 is often cheaper to purchase.");

            else if (msg.equals("!comparelongrange"))
                reply(event,"Compare aircraft by range, fuel burn, maintenance and seat capacity.");

            else if (msg.equals("!compareshortrange"))
                reply(event,"Short-range aircraft should focus on low operating costs and quick turnaround.");

            else if (msg.equals("!comparewidebody"))
                reply(event,"Wide-body aircraft are best for long-haul routes with high passenger demand.");

            else if (msg.equals("!comparenarrowbody"))
                reply(event,"Narrow-body aircraft are ideal for short and medium-haul routes.");

            else if (msg.equals("!compareefficiency"))
                reply(event,"Always compare fuel efficiency, maintenance costs and route demand.");

            else if (msg.equals("!compareall"))
                reply(event,"Use specific compare commands like !comparea350b787 or !comparea380b747 for detailed comparisons.");

                //================ COMPARE COMMANDS PART 4 =================//

            else if (msg.equals("!compare7474007478"))
                reply(event,"The B747-8 is newer, more fuel efficient and offers better performance than the B747-400.");

            else if (msg.equals("!comparea3501000a350900"))
                reply(event,"The A350-1000 has more seating capacity, while the A350-900 is cheaper to operate.");

            else if (msg.equals("!compare777200777300"))
                reply(event,"The B777-300 carries more passengers, while the B777-200 is better for lower demand.");

            else if (msg.equals("!compare78787879"))
                reply(event,"The B787-9 offers more range and capacity than the B787-8.");

            else if (msg.equals("!compare737max8737max9"))
                reply(event,"The 737 MAX 9 carries more passengers, while the MAX 8 is easier to fill.");

            else if (msg.equals("!comparea319a320"))
                reply(event,"The A320 offers more seats, while the A319 is suitable for smaller markets.");

            else if (msg.equals("!comparea318a319"))
                reply(event,"The A319 has higher capacity and better profitability on most routes.");

            else if (msg.equals("!comparecrj900e175"))
                reply(event,"The E175 is generally more economical, while the CRJ900 is faster.");

            else if (msg.equals("!comparea220100a220300"))
                reply(event,"The A220-300 has more seats, while the A220-100 fits lower demand routes.");

            else if (msg.equals("!compareatr42atr72"))
                reply(event,"The ATR 72 carries more passengers than the ATR 42.");

            else if (msg.equals("!comparemd11dc10"))
                reply(event,"The MD-11 is an upgraded version with better performance than the DC-10.");

            else if (msg.equals("!comparel1011dc10"))
                reply(event,"Both are classic tri-jets. Choose based on operating costs and route needs.");

            else if (msg.equals("!compare747f777f"))
                reply(event,"The B747F carries more cargo, while the B777F is more fuel efficient.");

            else if (msg.equals("!comparean124747f"))
                reply(event,"The AN-124 is built for oversized cargo, while the B747F is better for regular freight.");

            else if (msg.equals("!compareseat"))
                reply(event,"Always compare seat capacity with actual passenger demand.");

            else if (msg.equals("!compareroi"))
                reply(event,"ROI depends on purchase price, operating costs and route profitability.");

            else if (msg.equals("!comparemaintenance"))
                reply(event,"Lower maintenance costs improve long-term profitability.");

            else if (msg.equals("!comparepurchase"))
                reply(event,"Don't compare purchase price alone. Compare lifetime operating costs too.");

            else if (msg.equals("!comparevalue"))
                reply(event,"The best aircraft provides the highest long-term value, not just the lowest price.");

            else if (msg.equals("!comparehelp"))
                reply(event,"Use compare commands before buying expensive aircraft to make smarter decisions.");

                //================ ADVANCED STRATEGY =================//

            else if (msg.equals("!fleetplanning"))
                reply(event,"Plan your fleet around your routes instead of buying random aircraft.");

            else if (msg.equals("!hubstrategy"))
                reply(event,"Build one strong hub before expanding to multiple hubs.");

            else if (msg.equals("!routeoptimization"))
                reply(event,"Remove low-profit routes and replace them with higher-demand routes.");

            else if (msg.equals("!fleetoptimization"))
                reply(event,"Keep aircraft types limited to reduce management complexity.");

            else if (msg.equals("!longtermprofit"))
                reply(event,"Focus on stable daily profit instead of quick expansion.");

            else if (msg.equals("!cashreserve"))
                reply(event,"Always keep enough cash for fuel, maintenance and unexpected expenses.");

            else if (msg.equals("!expansionstrategy"))
                reply(event,"Expand only after your current fleet is consistently profitable.");

            else if (msg.equals("!airlinegrowth"))
                reply(event,"Grow step by step. Fast expansion without planning often reduces profit.");

            else if (msg.equals("!routeanalysis"))
                reply(event,"Analyze demand, distance and aircraft suitability before opening new routes.");

            else if (msg.equals("!fleetreplacement"))
                reply(event,"Replace older aircraft only when the new aircraft improves long-term profit.");

            else if (msg.equals("!highdemand"))
                reply(event,"Reserve your largest aircraft for routes with consistently high demand.");

            else if (msg.equals("!lowdemand"))
                reply(event,"Use smaller aircraft or close routes with poor demand.");

            else if (msg.equals("!airlineefficiency"))
                reply(event,"Higher efficiency comes from smart planning, not simply owning more aircraft.");

            else if (msg.equals("!smartgrowth"))
                reply(event,"Increase profit first, then increase fleet size.");

            else if (msg.equals("!prostrategy"))
                reply(event,"Successful airlines focus on profit, efficiency and long-term planning.");

                //================ ADVANCED STRATEGY PART 2 =================//

            else if (msg.equals("!roi"))
                reply(event,"ROI (Return on Investment) helps determine how quickly an aircraft pays for itself.");

            else if (msg.equals("!aircraftroi"))
                reply(event,"Choose aircraft with a strong balance of purchase price, fuel efficiency and profit.");

            else if (msg.equals("!huboptimization"))
                reply(event,"Optimize your hub by focusing on routes with consistently high demand and profitability.");

            else if (msg.equals("!multihub"))
                reply(event,"Open a second hub only after your main hub is fully optimized.");

            else if (msg.equals("!fleetrotation"))
                reply(event,"Rotate aircraft efficiently to maximize daily utilization.");

            else if (msg.equals("!loadfactor"))
                reply(event,"Keep load factor high by matching aircraft size to passenger demand.");

            else if (msg.equals("!yield"))
                reply(event,"Higher ticket yield increases profit but can reduce demand if priced too high.");

            else if (msg.equals("!ticketstrategy"))
                reply(event,"Adjust ticket prices using demand calculators for maximum profit.");

            else if (msg.equals("!fuelmarket"))
                reply(event,"Watch the fuel market and buy in bulk when prices are low.");

            else if (msg.equals("!fleetstandardization"))
                reply(event,"Using fewer aircraft types makes fleet management easier.");

            else if (msg.equals("!routecycle"))
                reply(event,"Review your routes regularly and replace weak performers.");

            else if (msg.equals("!network"))
                reply(event,"Build a balanced network instead of focusing on only one region.");

            else if (msg.equals("!endgame"))
                reply(event,"Late-game success depends on optimization, not rapid expansion.");

            else if (msg.equals("!elite"))
                reply(event,"Top airlines focus on efficiency, ROI and long-term planning.");

            else if (msg.equals("!mastertips"))
                reply(event,"A profitable airline is built through smart decisions, patience and continuous optimization.");

                //================ ADVANCED STRATEGY PART 3 =================//

            else if (msg.equals("!slots"))
                reply(event,"Never waste airport slots. Every slot should generate profit.");

            else if (msg.equals("!slotmanagement"))
                reply(event,"Replace low-profit routes with higher-profit routes when slots become limited.");

            else if (msg.equals("!fleetage"))
                reply(event,"Old aircraft aren't always bad. Replace them only if a newer aircraft increases overall profit.");

            else if (msg.equals("!replacement"))
                reply(event,"Calculate operating costs before replacing your aircraft.");

            else if (msg.equals("!expansion"))
                reply(event,"Expand only when your airline can support new routes financially.");

            else if (msg.equals("!networkplanning"))
                reply(event,"Build a network that connects high-demand airports instead of random destinations.");

            else if (msg.equals("!longhaulstrategy"))
                reply(event,"Long-haul routes require high demand and efficient wide-body aircraft.");

            else if (msg.equals("!shorthaulstrategy"))
                reply(event,"Short-haul operations succeed with fast turnaround and fuel-efficient aircraft.");

            else if (msg.equals("!cargostrategy"))
                reply(event,"Operate cargo routes only where cargo demand is consistently high.");

            else if (msg.equals("!fleetmix"))
                reply(event,"Use different aircraft sizes to match different route demands.");

            else if (msg.equals("!routebalance"))
                reply(event,"Keep a balance between short, medium and long-haul routes.");

            else if (msg.equals("!highprofitroutes"))
                reply(event,"Review your best-performing routes regularly and expand similar ones.");

            else if (msg.equals("!lossmakingroutes"))
                reply(event,"Close routes that remain unprofitable for a long period.");

            else if (msg.equals("!marketanalysis"))
                reply(event,"Study demand before investing in expensive aircraft.");

            else if (msg.equals("!airlinemanagement"))
                reply(event,"Successful airlines focus on planning, efficiency and stable profits.");

            else if (msg.equals("!experttips"))
                reply(event,"Optimize your fleet, monitor fuel prices and never expand faster than your income.");

            else if (msg.equals("!topplayer"))
                reply(event,"Top players don't buy the biggest aircraft first—they build the smartest airline.");

            else if (msg.equals("!airlineplanner"))
                reply(event,"Plan every aircraft purchase around your long-term strategy.");

            else if (msg.equals("!advancedhelp"))
                reply(event,"Master demand, ROI, fleet optimization and route planning to reach the top.");

            else if (msg.equals("!proguide"))
                reply(event,"A professional airline grows through consistency, not luck.");

                //================ ADVANCED STRATEGY PART 4 =================//

            else if (msg.equals("!fleetvalue"))
                reply(event,"Monitor your fleet value, but always prioritize profitability over expensive aircraft.");

            else if (msg.equals("!dailyincome"))
                reply(event,"Check your daily income before expanding your airline.");

            else if (msg.equals("!dailyprofit"))
                reply(event,"Consistent daily profit is better than occasional big earnings.");

            else if (msg.equals("!weeklyreport"))
                reply(event,"Review your airline every week and replace weak routes.");

            else if (msg.equals("!monthlygrowth"))
                reply(event,"Steady monthly growth is safer than rapid expansion.");

            else if (msg.equals("!aircraftusage"))
                reply(event,"Aircraft should spend more time flying than sitting idle.");

            else if (msg.equals("!idleaircraft"))
                reply(event,"Idle aircraft generate no income. Assign them to profitable routes.");

            else if (msg.equals("!peakhours"))
                reply(event,"Schedule flights efficiently to maximize aircraft utilization.");

            else if (msg.equals("!airportchoice"))
                reply(event,"Select airports with strong demand and enough slots for future growth.");

            else if (msg.equals("!routeupgrade"))
                reply(event,"Upgrade routes when passenger demand consistently exceeds aircraft capacity.");

            else if (msg.equals("!fleetupgrade"))
                reply(event,"Upgrade aircraft only if the new model improves long-term profits.");

            else if (msg.equals("!operatingcost"))
                reply(event,"Always compare operating costs before buying new aircraft.");

            else if (msg.equals("!expansionrisk"))
                reply(event,"Expanding too quickly can reduce cash flow and hurt profitability.");

            else if (msg.equals("!cashflow"))
                reply(event,"Healthy cash flow keeps your airline stable during expansion.");

            else if (msg.equals("!reservefund"))
                reply(event,"Keep reserve money for fuel purchases and maintenance.");

            else if (msg.equals("!routeefficiency"))
                reply(event,"Operate routes where demand matches your aircraft capacity.");

            else if (msg.equals("!airlinehealth"))
                reply(event,"A healthy airline balances growth, maintenance and profit.");

            else if (msg.equals("!managementtips"))
                reply(event,"Monitor your routes daily and don't ignore small losses.");

            else if (msg.equals("!professional"))
                reply(event,"Professional airlines succeed through planning, patience and smart investments.");

            else if (msg.equals("!expertguide"))
                reply(event,"Analyze every major purchase before spending your airline's money.");




        }
















































        else {
            System.out.println(msg);
        }
    }

    public static void reply(MessageReceivedEvent event, String text) {

        event.getChannel()
                .sendMessage(text)
                .queue();
    }
}