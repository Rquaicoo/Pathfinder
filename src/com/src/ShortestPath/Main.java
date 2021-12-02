package com.src.ShortestPath;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JFrame frame;
    private static JLabel label;
    private static JLabel source_label;
    private static JLabel destination_label;
    private static JLabel route;

    private static JButton button;
    private static JPanel panel;
    private static JTextField source;
    private static JTextField Destination;

    public Main() {
       //constructor
    }
    public static void main(String[] args) throws Exception {

        frame = new JFrame();
        button = new JButton("CLick here");

        panel= new JPanel();


        label = new JLabel("These are the locations presently available:   " +
                "0. Engineering Depart  \n" +
                "1. Computer Dept  \n" +
                "2. Law Faculty  \n" +
                "3. JQB  \n" +
                "4. Main Gate  \n" +
                "5. Performing Arts  \n" +
                "6. Maths and Stats \n" +
                "7. Balme \n" +
                "8. UGCS  \n" +
                "9. Business School \n" +
                "10. Volta Hall \n" +
                "11. Commonwealth \n" +
                "12. Great Hall  \n" +
                "13. Akuafo Hall \n" +
                "14. Legon Hall  \n" +
                "15. Bush Canteen  \n" +
                "16. Sarbah Park  \n" +
                "17. Fire Station  \n" +
                "18. Banking Square  \n" +
                "19. Night Market \n" +
                "20. Basic School " +
                "21. Diaspora  \n");

        source_label = new JLabel("Enter your current location");
        destination_label = new JLabel("Enter your final destination");

        source = new JTextField();
        source.setBounds(10, 20, 80, 25);

        Destination = new JTextField();
        Destination.setBounds(10, 20, 80, 25);


        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100,100));

        panel.add(label);
        panel.add(source_label);
        panel.add(source);
        panel.add(destination_label);
        panel.add(Destination);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String source1 = source.getText().toString();
                String destination1 = Destination.getText().toString();

                Node loc1;
                Node loc2;
                //Scanner sc = new Scanner(System.in);

                Graph graph = new Graph(true);
                Node engineeringDept = new Node(0, "Engineering Dept");
                Node csDept = new Node(1, "CS Dept");
                Node Law = new Node(2, "Law");
                Node JQB = new Node(3, "JQB");
                Node MainGate = new Node(4, "Main Gate");
                Node PerformingArts = new Node(5, "Performing Arts");
                Node MAthsandStats = new Node(6, "Maths And Stats Department");
                Node Balme = new Node(7, "Balme");
                Node UGCS = new Node(8, "UGCS");
                Node BusinessSchool = new Node(9, "Business School");
                Node VoltaHall = new Node(10, "Volta Hall");
                Node Commonwealth = new Node(11, "Commonwealth Hostel");
                Node GreatHall = new Node(12, "Great Hall");
                Node AkuafoHall = new Node(13, "Akuafo Hall");
                Node LegonHall = new Node(14, "Legon Hall");
                Node BushCanteen = new Node(15, "Bush Canteen");
                Node SarbahPark = new Node(16, "Sarbah Park");
                Node FireService = new Node(17, "Fire Station");
                Node BankingSquare = new Node(18, "Banking Square");
                Node NightMarket = new Node(19, "Night Market");
                Node BasicSchool = new Node(20, "UG Basic School");
                Node Diaspora = new Node(21, "Diaspora");

                loc1 = engineeringDept;
                loc2 = Diaspora;
                // Our addEdge method automatically adds Nodes as well.
                // The addNode method is only there for unconnected Nodes,
                // if we wish to add any
                graph.addEdge(engineeringDept, csDept, 270.12);
                graph.addEdge(csDept, engineeringDept, 270.12);

                graph.addEdge(engineeringDept, Law, 420.88);
                graph.addEdge(Law, engineeringDept, 420.88);

                graph.addEdge(engineeringDept, JQB, 502.43);
                graph.addEdge(JQB, engineeringDept, 502.43);

                graph.addEdge(csDept, Law, 346.45);
                graph.addEdge(Law, csDept, 346.45);

                graph.addEdge(Law, JQB, 289.39);
                graph.addEdge(JQB, Law, 289.39);

                graph.addEdge(csDept, MAthsandStats, 208.65);
                graph.addEdge(MAthsandStats, csDept, 208.65);

                graph.addEdge(MAthsandStats, UGCS, 653.88);
                graph.addEdge(UGCS, MAthsandStats, 653.88);

                graph.addEdge(UGCS, BusinessSchool, 407.81);
                graph.addEdge(BusinessSchool, UGCS, 407.81);

                graph.addEdge(BusinessSchool, VoltaHall, 346.82);
                graph.addEdge(VoltaHall, BusinessSchool, 346.82);

                graph.addEdge(VoltaHall, Commonwealth, 536.69);
                graph.addEdge(Commonwealth, VoltaHall, 536.69);

                graph.addEdge(Commonwealth, GreatHall, 586.81);
                graph.addEdge(GreatHall, Commonwealth, 586.81);

                graph.addEdge(MainGate, PerformingArts, 50.00);
                graph.addEdge(PerformingArts, MainGate, 50.00);

                graph.addEdge(PerformingArts, Balme, 992.04);
                graph.addEdge(Balme, PerformingArts, 992.04);

                graph.addEdge(UGCS, Balme, 269.71);
                graph.addEdge(Balme, UGCS, 269.71);

                graph.addEdge(Balme, AkuafoHall, 316.59);
                graph.addEdge(AkuafoHall, Balme, 316.59);

                graph.addEdge(Balme, Commonwealth, 520);
                graph.addEdge(Commonwealth, Balme, 520);

                graph.addEdge(PerformingArts, AkuafoHall, 701.74);
                graph.addEdge(AkuafoHall, PerformingArts, 701.74);

                graph.addEdge(Balme, LegonHall, 586.81);
                graph.addEdge(LegonHall, Balme, 586.81);

                graph.addEdge(LegonHall, AkuafoHall, 100);
                graph.addEdge(AkuafoHall, LegonHall, 100);

                graph.addEdge(LegonHall, BasicSchool, 1015.00);
                graph.addEdge(BasicSchool, LegonHall, 1015.00);

                graph.addEdge(LegonHall, SarbahPark, 500.00);
                graph.addEdge(SarbahPark, LegonHall, 500.00);

                graph.addEdge(AkuafoHall, SarbahPark, 200.00);
                graph.addEdge(SarbahPark, AkuafoHall, 200.00);

                graph.addEdge(BasicSchool, NightMarket, 591.36);
                graph.addEdge(NightMarket, BasicSchool, 591.36);

                graph.addEdge(NightMarket, Diaspora, 645.28);
                graph.addEdge(Diaspora, NightMarket, 645.28);

                graph.addEdge(NightMarket, BankingSquare, 1);
                graph.addEdge(BankingSquare, NightMarket, 1);

                graph.addEdge(NightMarket, BankingSquare, 957.14);
                graph.addEdge(BankingSquare, NightMarket, 957.14);

                graph.addEdge(BushCanteen, FireService, 122.85);
                graph.addEdge(FireService, BushCanteen, 122.85);

                graph.addEdge(FireService, BankingSquare, 957.14);
                graph.addEdge(BankingSquare, FireService, 957.14);

                //System.out.println("Input current location");

                String currentLocation = source1;

                switch (currentLocation) {
                    case "Engineering Dept":
                        loc1 = engineeringDept;
                        break;
                    case "CS Dept":
                        loc1 = csDept;
                        break;
                    case "Law Faculty":
                        loc1 = Law;
                        break;
                    case "JQB":
                        loc1 = JQB;
                        break;
                    case "Maths And Stats":
                        loc1 = MAthsandStats;
                        break;
                    case "Main Gate":
                        loc1 = MainGate;
                        break;
                    case "Performing Arts":
                        loc1 = PerformingArts;
                        break;
                    case "Balme":
                        loc1 = Balme;
                        break;
                    case "UGCS":
                        loc1 = UGCS;
                        break;
                    case "Business School":
                        loc1 = BusinessSchool;
                        break;
                    case "Volta Hall":
                        loc1 = VoltaHall;
                        break;
                    case "Commonwealth":
                        loc1 = Commonwealth;
                        break;
                    case "Great Hall":
                        loc1 = GreatHall;
                        break;
                    case "Akuafo Hall":
                        loc1 = AkuafoHall;
                        break;
                    case "Legon Hall":
                        loc1 = LegonHall;
                        break;
                    case "Sarbah Park":
                        loc1 = SarbahPark;
                        break;
                    case "Basic School":
                        loc1 = BasicSchool;
                        break;
                    case "Night Market":
                        loc1 = NightMarket;
                        break;
                    case "Diaspora":
                        loc1 = Diaspora;
                        break;
                    case "Bush Canteen":
                        loc1 = BushCanteen;
                        break;
                    case "Fire Station":
                        loc1 = FireService;
                        break;
                    case "Banking Square":
                        loc1 = BankingSquare;
                        break;

                }


                String destination = destination1;

                switch (destination) {
                    case "Engineering Dept":
                        loc2 = engineeringDept;
                        break;

                    case "CS Dept":
                        loc2 = csDept;
                        break;
                    case "Law Faculty":
                        loc2 = Law;
                        break;
                    case "JQB":
                        loc2 = JQB;
                        break;
                    case "Maths And Stats":
                        loc2 = MAthsandStats;
                        break;
                    case "Main Gate":
                        loc2 = MainGate;
                        break;
                    case "Performing Arts":
                        loc2 = PerformingArts;
                        break;
                    case "Balme":
                        loc2 = Balme;
                        break;
                    case "UGCS":
                        loc2 = UGCS;
                        break;
                    case "Business School":
                        loc2 = BusinessSchool;
                        break;
                    case "Volta Hall":
                        loc2 = VoltaHall;
                        break;
                    case "Commonwealth":
                        loc2 = Commonwealth;
                        break;
                    case "Great Hall":
                        loc2 = GreatHall;
                        break;
                    case "Akuafo Hall":
                        loc2 = AkuafoHall;
                        break;
                    case "Legon Hall":
                        loc2 = LegonHall;
                        break;
                    case "Sarbah Park":
                        loc2 = SarbahPark;
                        break;
                    case "Basic School":
                        loc2 = BasicSchool;
                        break;
                    case "Night Market":
                        loc2 = NightMarket;
                        break;
                    case "Diaspora":
                        loc2 = Diaspora;
                        break;
                    case "Bush Canteen":
                        loc2 = BushCanteen;
                        break;
                    case "Fire Station":
                        loc2 = FireService;
                        break;

                    case "Banking Square":
                        loc2 = BankingSquare;
                        break;
                }

                String path = graph.shortestPath(loc1, loc2);
                route = new JLabel(path);
                panel.add(route);
            }
        });

        panel.setLayout(new GridLayout(0, 1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Find path");
        frame.pack();
        frame.setVisible(true);
    }



}

