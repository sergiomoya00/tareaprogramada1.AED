/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import Collections.LQueue;
import Collections.SimpleLinkeList;
import Collections.DoubleLinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author samoy
 */
public class LotteryManager {

    List<Tickets> tickets = new SimpleLinkeList<>();
    List<Raffle> raffles = new DoubleLinkedList<>();
    List<Client> clients = new LQueue<>();
    List<Loteria> loterias = new LQueue<>();
    List<Lotto> lottos = new SimpleLinkeList<>();
    List<Bingo> bingos = new ArrayList<>();
    List<Tiempos> tiemposs = new ArrayList<>();

    private static LotteryManager instance;

    public static LotteryManager getInstance() {
        return instance;
    }

    public void removeClient(int index) {
        clients.remove(index);
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void removeRaffle(int index) {
        raffles.remove(index);
    }

    public Collection<Raffle> getRaffles() {
        return raffles;
    }

    public void addRaffle(Raffle newRaffle) {
        this.raffles.add(newRaffle);
    }

    public void removeTickets(int index) {
        tickets.remove(index);
    }

    public Collection<Tickets> getTickets() {
        return tickets;
    }

    public void addTickets(Tickets newTickets) {
        this.tickets.add(newTickets);
    }

    public Collection<Raffle> searchRaffle(Raffle newRaffle) {
        List<Raffle> results = new SimpleLinkeList<>();

        boolean byName = newRaffle.getName() != null && newRaffle.getName().length() > 0;
        boolean byType = newRaffle.getType() != null && newRaffle.getType().length() > 0;
        boolean byEmission = newRaffle.getEmission() != null && newRaffle.getEmission().length() > 0;

        for (Raffle raffle : raffles) {
            boolean add = !(byName || byType || byEmission);
            if (!add && byName && raffle.getName().contains(newRaffle.getName())) {
                add = true;
            }
            if (!add && byType && raffle.getType().contains(newRaffle.getType())) {
                add = true;
            }
            if (!add && byEmission && raffle.getEmission().contains(newRaffle.getEmission())) {
                add = true;
            }
            if (add) {
                results.add(raffle);
            }
        }

        return results;

    }

}
