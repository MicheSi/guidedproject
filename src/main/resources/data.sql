DELETE
FROM CATS;

INSERT INTO CATS (catid, catname)
    VALUES (1, 'Tiger');

alter sequence hibernate_sequence restart with 15;