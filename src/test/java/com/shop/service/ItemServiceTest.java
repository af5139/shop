package com.shop.service;

import com.shop.repository.ItemImgRepository;
import com.shop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class ItemServiceTest {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    ItemImgRepository itemImgRepository;
}
