package com.tw.storage;

import com.tw.context.GameContext;

import java.io.*;

public class FileStorage implements Storage {
    @Override
    public void save(GameContext gameContext) {
        try {
            FileOutputStream fileOutputStream
                    = new FileOutputStream("rpggame.dat");
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(gameContext);
            objectOutputStream.flush();
            objectOutputStream.close();
        }catch(FileNotFoundException ex){
            System.out.println("File to save game is not available.");
        } catch (IOException ex){
            System.out.println("Save game is impossible.");
        }
    }

    @Override
    public GameContext load() {
        GameContext gameContext = null;
        try {
            FileInputStream fileInputStream
                    = new FileInputStream("rpggame.dat");
            ObjectInputStream objectInputStream
                    = new ObjectInputStream(fileInputStream);
            gameContext = (GameContext)objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File to load game is not avaliable.");
        } catch (IOException ex){
            System.out.println("Load game is imposible.");
        } catch (ClassNotFoundException ex){
            System.out.println("Incorrect type of save game file.");
        }
        return gameContext;
    }
}
