/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.dao;

import java.io.Serializable;
import net.smktarunabhakti.penjualan.domain.Barang;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author firhan
 */
public interface  BarangDao extends  PagingAndSortingRepository<Barang, String> {
    
}
