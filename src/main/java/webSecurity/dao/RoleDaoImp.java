package webSecurity.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import webSecurity.model.Role;
import webSecurity.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

@Repository
public class RoleDaoImp implements RoleDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Role> getRoles() {
        Query query = entityManager.createQuery("from Role");
        List<Role> result = query.getResultList();
        return result;
    }
}
