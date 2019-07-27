package mohannad.springframework.sfgpetclinic.services.map;

import mohannad.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map <ID , T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){

        if(object != null) {
            if(object.getId() == null){
                object.setId(getNextId());
            }

            map.put((ID) object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }


    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextId(){

        Long nextId = null;

        try {
            nextId = (Collections.max(map.keySet()));
            ++nextId;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }
}
