package pan.java.foundation.base.innerClass.CarStore;

import pan.java.foundation.base.innerClass.LinkedList.Link;
import pan.java.foundation.base.innerClass.LinkedList.LinkImpl;

/**
 * @BelongsProject: Java_Data
 * @BelongsPackage: pan.java.foundation.base.innerClass.CarStore
 * @Author: panYongSen
 * @CreateTime: 2023-05-17  11:19
 * @Description:≥ËŒÔ¿‡…ÃµÍ
 * @Version: 1.0
 */
public class PetShop {
    Link<Pet> petCar = new LinkImpl<Pet>();
    public void addPet(Pet pet){
        this.petCar.add(pet);
    }
    public void deletePet(Pet pet){
        this.petCar.remove(pet);
    }
    public Link<Pet> search(String petId){
        Link<Pet> results = new LinkImpl<Pet>();
        Object result[] = this.petCar.toArray();
        if(result != null){
            for(Object obj: result){
                Pet p = (Pet)obj;
                if(p.getName().contains(petId) || p.getColor().contains(petId)){
                    results.add(p);
                }
            }
        }
        return results;
    }
}
