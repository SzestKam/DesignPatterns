package pattern.builder;

class Main {

    public static void main(String[] args) {
        ScheduleRoom scheduleRoom_1
                = new ScheduleRoom.ScheduleRoomBuilder(8, 16)
                .build();

        ScheduleRoom scheduleRoom_2 = new ScheduleRoom.ScheduleRoomBuilder(8, 11)
                .addFlipBoard()
                .addDrinkService()
                .addProjector("large quality")
                .build();

        System.out.println(scheduleRoom_1);
        System.out.println(scheduleRoom_2);

        ComputerPC pc1 = new ComputerPC.PCMaker("Intel", 512, "Asrock").build();

        ComputerPC pc2 = new ComputerPC.PCMaker("AMD", 1024, "DELL")
                .addGraphicCard("N Vidia 4GB")
                .addHDD(1024)
                .computerName("DELL")
                .build();

        System.out.println(pc1.about());
        System.out.println(pc2);

        Sandwich sandwich = new Sandwich.SandwichBuilder()
                .breadType("graham")
                .cheese(false)
                .hamType("salami")
                .ketchup(false)
                .build();

        System.out.println(sandwich);

    }

}
