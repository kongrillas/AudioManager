package Audiomanagertest;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Ui {
    public Choice menu(){
        Choice returnChoice;
        System.out.println("0. Exit" + "1. Add something to the process" + "  2.Remove something from the process" + " 3. Display the process" );
        int choice;
        Scanner scanner = new Scanner(System.in);
        try{
            choice = scanner.nextInt();
            switch (choice){
                case 0 :
                    return Choice.EXIT;
                case 1 :
                    return Choice.ADD;
                case 2 :
                    return Choice.REMOVE;
                case 3 :
                    return Choice.DISPLAY;
                case 4 :
                    return Choice.SAVE;
                case 5 :
                    return Choice.LOAD;
                    default:
                    return Choice.ERROR;

            }
        }
        catch (Exception e) {
            return Choice.ERROR;
        }
    }
    public Media createMEDIA(){
        String name;
        String creator;
        String description;
        float size;
        String duration;
        float value;
        float qualityVisual;
        String type;
        int indextype;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1  For Video   2. For Audio");
        indextype = scanner.nextInt();

        System.out.println("Give the media name");
        name = scanner.next();
        System.out.println("Give the media creator");
        creator = scanner.next();
        System.out.println("Give the media description");
        description = scanner.next();
        System.out.println("Give the media size");
        size = scanner.nextFloat();
        System.out.println("Give the media duration");
        duration = scanner.next();
        System.out.println("Give the media value");
        value = scanner.nextFloat();



        Media media;
        switch (indextype){
            case 1:
                System.out.println("Give video's quality");
                qualityVisual = scanner.nextFloat();
                media = new Visual(name,creator,description,size,duration,value,qualityVisual);
                return media;
            case 2:
                System.out.println("Give the audio type");
                type = scanner.next();
                media = new Audio(name,creator,description,size,duration,value,type);
                return media;
            default:
                return null;
        }
    }

        public void manageProcess(Process process) {

            Choice choice;
            do {
                choice = menu();

                switch (choice) {
                    case ADD:
                        Media media = createMEDIA();
                        process.addMedia(media);
                        break;
                    case REMOVE:
                        System.out.println("Give an index to remove");
                        Scanner scanner = new Scanner(System.in);
                        int index = scanner.nextInt();
                        process.removeMedia(index);
                        break;
                    case DISPLAY:
                        process.displayMedia();
                        break;
                    case SAVE:
                        process.saveProcess("process.txt");
                        break;
                    case LOAD:
                        process.loadProcess("process.txt");
                        break;
                    case EXIT:
                        break;
                    case ERROR:
                        System.out.println("You gave a wrong input");
                        break;
                }
            } while (choice!=Choice.EXIT);
        }

}
