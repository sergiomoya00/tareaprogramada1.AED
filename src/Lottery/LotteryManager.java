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
    List<Loteria> loterias = new SimpleLinkeList<>();
    List<Lotto> lottos = new SimpleLinkeList<>();
    List<Bingo> bingos = new ArrayList<>();
    List<Tiempos> tiemposs = new ArrayList<>();

    public static final LotteryManager instance;

    public static LotteryManager getInstance() {
        return instance;
    }

    static {
        instance = new LotteryManager();
        instance.raffles.add(new Raffle() {
            {
                setName("Gordo");
                setNumbemission(1);
                setType(RaffleType.Loteria.name());
                setEmission("12/12/19");
                setCode(45);
            }
        });
        instance.raffles.add(new Raffle() {
            {
                setName("Marzo");
                setNumbemission(2);
                setType(RaffleType.Lotto.name());
                setEmission("12/11/19");
                setCode(34);
            }
        });
    }

    public void removeLoteria(int index) {
        loterias.remove(index);
    }

    public Collection<Loteria> getLoterias() {
        return loterias;
    }

    public void addLoteria(Loteria newLoteria) {
        this.loterias.add(newLoteria);
    }

    public void removeLotto(int index) {
        lottos.remove(index);
    }

    public Collection<Lotto> getLotto() {
        return lottos;
    }

    public void addLotto(Lotto newLotto) {
        this.lottos.add(newLotto);
    }

    public void removeBingo(int index) {
        bingos.remove(index);
    }

    public Collection<Bingo> getBingos() {
        return bingos;
    }

    public void addBingo(Bingo newBingo) {
        this.bingos.add(newBingo);
    }

    public void removeTiempos(int index) {
        tiemposs.remove(index);
    }

    public Collection<Tiempos> getTiempos() {
        return tiemposs;
    }

    public void addTiempos(Tiempos newTiempos) {
        this.tiemposs.add(newTiempos);
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void removeCustomer(Client client) {
        clients.remove(client);
    }

    public Collection<Client> getClient() {
        return clients;
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
