package com.pb.korobko.hw11;

import java.io.*;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    private final List<Contact> contacts = new ArrayList<>();
    private final List<Contact> contactsFromFile = new ArrayList<>();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContactInfo(new Contact());
        phoneBook.addContactInfo(new Contact());
        phoneBook.addContactInfo(new Contact());

        System.out.println("Пожалуйста, введите имя контакта для редактирования:");
        phoneBook.editContact(scan.next());

        System.out.println("Пожалуйста, введите имя контакта для удаления:");
        phoneBook.removeContact(phoneBook.findByName(scan.next()));

        System.out.println("Контакты отсортированы по имени: ");
        System.out.println(phoneBook.getContactsOrderedByName());

        System.out.println("Контакты отсортированы по дням рождения:");
        System.out.println(phoneBook.getContactsOrderedByBirthday());

        System.out.println("Сохранить контакты в файл");
        phoneBook.saveContactsToFile();

        System.out.println("Прочитать контакты из файла");
        phoneBook.readContactsFromFile();
        System.out.println(phoneBook.contactsFromFile);
    }

    public void addContactInfo(Contact contact) {

        System.out.println("Пожалуйста, введите полное имя:");
        contact.setFullName(scan.nextLine());

        System.out.println("Укажите дату рождения в формате гггг-мм-дд:");
        contact.setBirthday(LocalDate.parse(scan.next()));

        Set<String> phoneNumbers = new HashSet<>();
        System.out.println("Пожалуйста, введите номер телефона:");
        phoneNumbers.add(scan.next());
        contact.setContactPhoneNumbers(phoneNumbers);

        System.out.println("Пожалуйста, введите адрес:");
        contact.setAddress(scan.next());

        contact.setEditDateTime(LocalDateTime.now());
        contacts.add(contact);
        System.out.println("Новый контакт успешно добавлен.");
        scan.nextLine();
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
        System.out.println("Контакт был успешно удален.");
    }

    public Contact findByName(String contactName) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void editContact(String contactName) {
        Contact contactToEdit = findByName(contactName);
        if (contactToEdit != null) {
            scan.nextLine();
            removeContact(contactToEdit);
            addContactInfo(contactToEdit);
        }
    }

    public List<Contact> getContactsOrderedByName() {
        return contacts.stream().sorted(Comparator.comparing(Contact::getFullName)).collect(Collectors.toList());
    }

    public List<Contact> getContactsOrderedByBirthday() {
        return contacts.stream().sorted(Comparator.comparing(Contact::getBirthday)).collect(Collectors.toList());
    }

    public void saveContactsToFile() {
        try(FileOutputStream outputStream = new FileOutputStream("contacts.ser")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Contact contact : contacts) {
                objectOutputStream.writeObject(contact);
            }
        } catch (Exception exception) {
            System.out.println("Ошибка при записи файла: " + exception);
        }
    }

    public void readContactsFromFile() {
        ObjectInputStream objectInputStream = null;
        try(FileInputStream streamIn = new FileInputStream("contacts.ser")) {
            objectInputStream = new ObjectInputStream(streamIn);
            Contact contact;
            do {
                contact = (Contact) objectInputStream.readObject();
                if(contact != null){
                    contactsFromFile.add(contact);
                }
            } while (contact != null);
        } catch (Exception e) {
            System.out.println("Файл был успешно прочитан");
        }
    }
}