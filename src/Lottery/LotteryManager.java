/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import Collections.LQueue;
import Collections.SimpleLinkeList;
import Collections.DoubleLinkedList;
import Collections.Stack;
import Collections.PriorityQueueFinal;
import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author samoy
 */
public class LotteryManager {

    List<Tickets> tickets = new SimpleLinkeList<>();
    List<Preorder> preorders = new SimpleLinkeList<>();
    List<Raffle> raffles = new DoubleLinkedList<>();
    List<Client> clients = new SimpleLinkeList<>();
    List<Loteria> loterias = new SimpleLinkeList<>();
    List<Lotto> lottos = new SimpleLinkeList<>();
    List<Bingo> bingos = new ArrayList<>();
    List<Tiempos> tiemposs = new ArrayList<>();
    private PriorityQueueFinal orderss = new PriorityQueueFinal();
    private Adapter orders;
    List<Historial> historials = new Stack<>();

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
                setDate("25/11/19");
                setCode(45);
            }
        });
        instance.raffles.add(new Raffle() {
            {
                setName("Marzo");
                setNumbemission(2);
                setType(RaffleType.Lotto.name());
                setEmission("12/11/19");
                setDate("25/11/19");
                setCode(34);
            }
        });
    }

    public void addOrderr(Order order) {
        this.orderss.insert(order);
    }

    public void removeOrderrr() {
        orderss.remove();
    }

    public PriorityQueueFinal getOrderrr() {
        return orderss;
    }
    
       public Order getOrderrss(int index) {
        Order order = (Order) orderss.get(index);
        return order;
    }

    public void removeHistorial(Historial historial) {
        historials.remove(historial);
    }

    public Collection<Historial> getHistorials() {
        return historials;
    }

    public void addHistorial(Historial newHistorial) {
        this.historials.add(newHistorial);
    }

    public void addOrder(Order order) {
        this.orders.push(order);
    }

    public void removeOrder() {
        orders.pop();
    }

    public Adapter getOrder() {
        return orders;
    }

    public void removepreOrder(int index) {
        preorders.remove(index);
    }

    public Collection<Preorder> getpreOrders() {
        return preorders;
    }

    public void addpreOrder(Preorder newpreOrder) {
        this.preorders.add(newpreOrder);
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

    /**
     * @return @param index
     * @author samoy
     */
    public Preorder getPreorder(int index) {
        Preorder preorder = preorders.get(index);
        return preorder;
    }

    public void addTickets(Tickets newTickets) {
        this.tickets.add(newTickets);
    }

    public Collection<Raffle> searchRaffle(Raffle newRaffle) {
        List<Raffle> results = new ArrayList<>();

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
