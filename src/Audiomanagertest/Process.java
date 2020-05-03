package Audiomanagertest;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Process {

    private ArrayList<Media> medias = new ArrayList<>();

    public void addMedia(Media media) {
        medias.add(media);
    }

    public void removeMedia(int index) {
        if (index >= 0 && index < medias.size()) {
            medias.remove(index);
        }
    }

    public void displayMedia() {
        medias.forEach(media -> System.out.println(media));

    }

    public void saveProcess(String filename) {
        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Media m : medias) {
                printWriter.println(m.getCreator() + "," + m.getDescription() + "," + m.getDuration() + "," + m.getName() + "," + m.getSize() + "," + m.getValue());

            }
            printWriter.close();
        } catch (Exception e) {
            System.out.println("The file cannot be saved");

        }

    }

    public void loadProcess(String filename) {
        medias.clear();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(",");
                Media media = new Audio(
                        words[0],
                        words[1],
                        words[2],
                        Float.parseFloat(words[3]),
                        words[4],
                        Float.parseFloat(words[5]), "mp3");
                medias.add(media);

                Media media_1 = new Visual(
                        words[0],
                        words[1],
                        words[2],
                        Float.parseFloat(words[3]),
                        words[4],
                        Float.parseFloat(words[5]),
                        80.0f);
                medias.add(media_1);
            }
        }
        catch (Exception e){

            }
        }


}


