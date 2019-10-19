package com.jyf.thrift;

import com.jyf.thrift.generated.DataException;
import com.jyf.thrift.generated.Person;
import com.jyf.thrift.generated.PersonService;
import org.apache.thrift.TException;

public class PersionServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        Person person = new Person();
        person.setUsername("taylor thrift");
        person.setAge(30);
        person.setMarried(false);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person.getUsername());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
    }
}
