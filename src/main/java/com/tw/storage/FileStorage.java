package com.tw.storage;

import com.tw.character.Character;

import java.io.*;
import java.util.Optional;

public class FileStorage implements Storage {
    @Override
    public void save(Character hero) {
        try {
            FileOutputStream fileOutputStream
                    = new FileOutputStream("hero.dat");
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hero);
            objectOutputStream.flush();
            objectOutputStream.close();
        }catch(FileNotFoundException ex){
            System.out.println("File to save game is not avaliable.");
        } catch (IOException ex){
            System.out.println("Save game is imposible.");
        }
    }

    @Override
    public Optional<Character> load() {
        Character hero = null;
        try {
            FileInputStream fileInputStream
                    = new FileInputStream("hero.dat");
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);
            hero = (Character) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File to load game is not avaliable.");
        } catch (IOException ex){
            System.out.println("Save game is imposible.");
        } catch (ClassNotFoundException ex){
            System.out.println("Inproper type of save game file.");
        }
        return hero != null ? Optional.of(hero): Optional.empty();
    }
}
