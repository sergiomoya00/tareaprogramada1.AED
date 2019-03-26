/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import Collections.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author samoy
 */
public class LotteryManager {

    List<Tickets> tickets = new SimpleLinkeList<>();
    List<Raffle> raffle = new DoubleLinkedList<>();
    List<Client> client = new SimpleLinkeList<>();
    List<Loteria> loteria = new LQueue<>();
    List<Lotto> lotto = new SimpleLinkeList<>();
    List<Bingo> bingo = new ArrayList<>();
    List<Tiempos> tiempos = new ArrayList<>();

    private static LotteryManager instance;

    public static LotteryManager getInstance() {
        return instance;
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
/*
    public Collection<Tickets> search(Tickets newTicket) {
        List<Tickets> results = new ArrayList<>();

        boolean byName = newTicket.getName() != null && newTicket.getName().length() > 0;
        boolean byType = newTicket.getTopic() != null && newTicket.getTopic().length() > 0;

        for (Tickets ticket : tickets) {
            boolean add = !(byName || byType);
            if (!add && byName && ticket.getRaffleType().contains(newTicket.getRaffleType())) {
                add = true;
            }
            if (!add && byType && ticket.getTopic().contains(newTicket.getTopic())) {
                add = true;
            }
            if (add) {
                results.add(ticket);
            }
        }

        return results;

    }
*/
}
