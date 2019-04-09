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

    //Se asigna a cada clase una estructura de datos en donde se almacenan elementos y sus atributos. 
    List<Tickets> tickets = new SimpleLinkeList<>();
    List<Preorder> preorders = new SimpleLinkeList<>();
    List<Raffle> raffles = new DoubleLinkedList<>();
    List<Client> clients = new SimpleLinkeList<>();
    List<Loteria> loterias = new SimpleLinkeList<>();
    List<Lotto> lottos = new SimpleLinkeList<>();
    List<Bingo> bingos = new ArrayList<>();
    List<Tiempos> tiemposs = new ArrayList<>();
    List<Historial> historials = new Stack<>();
    private PriorityQueueFinal orderss = new PriorityQueueFinal();

    //Variable para crear la instancia y referenciar los métodos por medio de ella.
    public static final LotteryManager instance;

    public static LotteryManager getInstance() {
        return instance;
    }

    //Se crean algunas rifas por defecto para pruebas.
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

    //Métodos para añadir y eliminar un elemento de tipo Order. 
    public void addOrderr(Order order) {
        this.orderss.insert(order);
    }

    public void removeOrderrr() {
        orderss.remove();
    }

    //Método para obtener todos los elementos de la lista Order.
    public PriorityQueueFinal getOrderrr() {
        return orderss;
    }

    //Método para obtener un elemento por medio de su posición.
    public Order getOrderrss(int index) {
        Order order = (Order) orderss.get(index);
        return order;
    }

    //Métodos para añadir y eliminar un elemento de tipo Historial.
    public void removeHistorial(Historial historial) {
        historials.remove(historial);
    }

    public void addHistorial(Historial newHistorial) {
        this.historials.add(newHistorial);
    }

    //Método para obtener todos los elementos de la lista Historials.
    public Collection<Historial> getHistorials() {
        return historials;
    }

    //Método para obtener todos los elementos de la lista Preorders.
    public Collection<Preorder> getpreOrders() {
        return preorders;
    }

    //Método para obtener un elemento por medio de su posición. 
    public Preorder getPreorder(int index) {
        Preorder preorder = preorders.get(index);
        return preorder;
    }

    //Métodos para añadir y eliminar un elemento de tipo Preorder.
    public void addpreOrder(Preorder newpreOrder) {
        this.preorders.add(newpreOrder);
    }

    public void removepreOrder(int index) {
        preorders.remove(index);
    }

    //Método para obtener todos los elementos de la lista Loterias.
    public Collection<Loteria> getLoterias() {
        return loterias;
    }

    //Métodos para añadir y eliminar un elemento de tipo Loteria.
    public void addLoteria(Loteria newLoteria) {
        this.loterias.add(newLoteria);
    }

    public void removeLoteria(int index) {
        loterias.remove(index);
    }

    //Método para obtener todos los elementos de la lista Lotto.
    public Collection<Lotto> getLotto() {
        return lottos;
    }

    //Métodos para añadir y eliminar un elemento de tipo Lotto.
    public void addLotto(Lotto newLotto) {
        this.lottos.add(newLotto);
    }

    public void removeLotto(int index) {
        lottos.remove(index);
    }

    //Método para obtener todos los elementos de la lista Bingos.
    public Collection<Bingo> getBingos() {
        return bingos;
    }

    //Métodos para añadir y eliminar un elemento de tipo Bingo.
    public void addBingo(Bingo newBingo) {
        this.bingos.add(newBingo);
    }

    public void removeBingo(int index) {
        bingos.remove(index);
    }

    //Método para obtener todos los elementos de la lista Tiempos.
    public Collection<Tiempos> getTiempos() {
        return tiemposs;
    }

    //Métodos para añadir y eliminar un elemento de tipo Tiempos.
    public void addTiempos(Tiempos newTiempos) {
        this.tiemposs.add(newTiempos);
    }

    public void removeTiempos(int index) {
        tiemposs.remove(index);
    }

    //Métodos para añadir y eliminar un elemento de tipo Client.
    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void removeCustomer(Client client) {
        clients.remove(client);
    }

    //Método para obtener todos los elementos de la lista Client.
    public Collection<Client> getClient() {
        return clients;
    }

    //Métodos para añadir y eliminar un elemento de tipo Raffle.
    public void removeRaffle(int index) {
        raffles.remove(index);
    }

    public void addRaffle(Raffle newRaffle) {
        this.raffles.add(newRaffle);
    }

    //Método para obtener todos los elementos de la lista Raffles.
    public Collection<Raffle> getRaffles() {
        return raffles;
    }

    //Método para eliminar un elemento de tipo Tickets.
    public void addTickets(Tickets newTickets) {
        this.tickets.add(newTickets);
    }

    public void removeTickets(int index) {
        tickets.remove(index);
    }

    //Método para obtener todos los elementos de la lista Tickets.
    public Collection<Tickets> getTickets() {
        return tickets;
    }

    /**
     * @return @param index
     * @author samoy
     */
    
    //Médoto para la búsqueda de rifas por medio del nombre, tipo o fecha de emisión.
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
