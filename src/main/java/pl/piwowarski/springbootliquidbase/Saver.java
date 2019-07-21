package pl.piwowarski.springbootliquidbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Saver {

    private AnimalRepo animalRepo;

    @Autowired
    public Saver(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        animalRepo.save(new Animal("Tapsik"));
    }


}
