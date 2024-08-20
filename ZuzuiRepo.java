package com.zuzui.zuzui.Repository;
import com.zuzui.zuzui.Model.zuzui;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZuzuiRepo extends JpaRepository <zuzui,Long>{
    zuzui findByEmail(String e);

}
