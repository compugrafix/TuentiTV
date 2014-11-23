package com.tuenti.tuentitv.ui.presenter;

import com.tuenti.tuentitv.ui.model.CardInfo;
import com.tuenti.tuentitv.ui.model.Contact;
import com.tuenti.tuentitv.ui.model.ConversationSummary;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 * Class created to work as main view presenter. This presenter has all the responsibility related
 * to the main view presentation logic.
 *
 * Responsibilities:
 *
 * - Obtains a list of favorite contacts.
 *
 * - Obtains a list of recent conversations.
 *
 * - Show a list of all user's contacts sorted alphabetically.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class MainPresenter {

  private static final String DEFAULT_BACKGROUND_URL =
      "https://tuentiassets3-a.akamaihd.net/AADYA-oRVco";

  private View view;

  @Inject public MainPresenter() {
    //Empty
  }

  public void setView(View view) {
    this.view = view;
  }

  public void loadData() {
    view.updateBackground(DEFAULT_BACKGROUND_URL);
    List<CardInfo> favorites = getFavoriteContacts();
    List<CardInfo> conversations = getConversations();
    List<CardInfo> contacts = getAllContacts();
    view.showMainInformation(favorites, conversations, contacts);
  }

  private List<CardInfo> getFavoriteContacts() {
    List<CardInfo> favorites = new ArrayList<CardInfo>();
    favorites.add(new Contact("Fina Perez", "https://imrl.tuenti.net/Mev9lAPPtkUlXKrgAA"));
    favorites.add(new Contact("Joaquin Engelmo", "https://imrl.tuenti.net/MeqNvwQ3IFNBDGnUAA"));
    favorites.add(new Contact("Juanjo Torroglosa", "https://imrl.tuenti.net/IMwzMQOv3yxSsLLxAA"));
    favorites.add(new Contact("Víctor Corugedo", "https://imrl.tuenti.net/MczWnAPlHhALIiljAA"));
    favorites.add(new Contact("Iván Mosquera", "https://imrl.tuenti.net/Mek7iQPYc565Wkj7AA"));
    return favorites;
  }

  private List<CardInfo> getConversations() {
    List<CardInfo> conversations = new ArrayList<CardInfo>();
    conversations.add(new ConversationSummary("Android Developers",
        "http://www.androidguys.com/wp-content/uploads/2011/12/android-developer-logo.png",
        "Pull request sent!!"));
    conversations.add(
        new ConversationSummary("Andu Fratu", "https://imrl.tuenti.net/MewKTgRZKByd5oZ9AA",
            "Hey, do you have the test ready?"));
    conversations.add(
        new ConversationSummary("Carmen Barroso", "https://imrl.tuenti.net/MexNAAOXqRoOXZcYAA",
            "Bye!"));
    conversations.add(
        new ConversationSummary("Cesar Estébanez", "https://imrl.tuenti.net/MeqsBwSymhO82EB9AA",
            "Hey, do you have the test ready?"));
    conversations.add(
        new ConversationSummary("Eduardo Ramirez", "https://imrl.tuenti.net/Mef8vgRt9SHKr5U0AA",
            "Do you come to the kitchen??"));
    conversations.add(
        new ConversationSummary("Laura Rus", "https://imrl.tuenti.net/MefvswOREWiM7ehEAA",
            "I have news!! :)"));
    conversations.add(
        new ConversationSummary("Roberto Fernández", "https://imrl.tuenti.net/Me2X1ATgzxoIlIjAAA",
            "I've a problem with one animation, can you help me?"));
    conversations.add(
        new ConversationSummary("David Santiago", "https://imrl.tuenti.net/Me4XWwQtq65VyIUVAA",
            "Beers after work?"));
    return conversations;
  }

  private List<CardInfo> getAllContacts() {
    List<CardInfo> contacts = new ArrayList<CardInfo>();
    contacts.add(new Contact("Aarón", "https://imrl.tuenti.net/MexmzwOwyK_qaPXpAA"));
    contacts.add(new Contact("Blanca Díaz", "https://imrl.tuenti.net/MexmsQOUyDnTABlnAA"));
    contacts.add(new Contact("Carmen Barroso", "https://imrl.tuenti.net/MexNAAOXqRoOXZcYAA"));
    contacts.add(new Contact("Carlos Perez", "https://imrl.tuenti.net/ILQtUgOLW18w1mHaAA"));
    contacts.add(new Contact("Diana Hernández", "https://imrl.tuenti.net/MeUzdwP0dhA6dQhWAA"));
    contacts.add(new Contact("Eduardo Ramirez", "https://imrl.tuenti.net/Mef8vgRt9SHKr5U0AA"));
    contacts.add(new Contact("Eduardo Gonzalez", "https://imrl.tuenti.net/MeHopQQgmSi7GQGdAA"));
    contacts.add(new Contact("Fernando Cejas", "https://imrl.tuenti.net/MeyKggSu6c3B22wiAA"));
    contacts.add(new Contact("Joaquin Engelmo", "https://imrl.tuenti.net/MeqNvwQ3IFNBDGnUAA"));
    contacts.add(new Contact("Laura Rus", "https://imrl.tuenti.net/MefvswOREWiM7ehEAA"));
    contacts.add(new Contact("Manolo Vera", "https://imrl.tuenti.net/MeskMwOsS3aHCO-fAA"));
    contacts.add(new Contact("Sebas Muriel", "https://imrl.tuenti.net/CZ-M0wOhf0IbHVN2AA"));
    return contacts;
  }

  public interface View {
    void updateBackground(String imageUrl);

    void showMainInformation(List<CardInfo> favorites, List<CardInfo> conversations,
        List<CardInfo> contacts);
  }
}