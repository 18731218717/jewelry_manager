package org.bdyy.jewelry.serviceImpl;

import org.bdyy.jewelry.dao.*;
import org.bdyy.jewelry.pojo.*;
import org.bdyy.jewelry.service.PageLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageLoaderServiceImpl implements PageLoaderService {
    @Autowired
    FinishedProductTypeMapper finishedProductTypeMapper;
    @Autowired
    FinishedProductBroadHeadingMapper finishedProductBroadHeadingMapper;
    @Autowired
    FinishedProductSubclassMapper finishedProductSubclassMapper;
    @Autowired
    FinishedProductDiscernMapper finishedProductDiscernMapper;
    @Autowired
    UnitMapper unitMapper;
    @Autowired
    TextureMapper textureMapper;
    @Autowired
    CurrencyMapper currencyMapper;

    @Override
    public List<FinishedProductType> finishedProductType() {
        FinishedProductTypeExample finishedProductTypeExample = new FinishedProductTypeExample();
        return finishedProductTypeMapper.selectByExample(finishedProductTypeExample);
    }

    @Override
    public List<FinishedProductBroadHeading> finishedProductBroadHeading() {
        FinishedProductBroadHeadingExample finishedProductBroadHeadingExample = new FinishedProductBroadHeadingExample();
        return finishedProductBroadHeadingMapper.selectByExample(finishedProductBroadHeadingExample);
    }

    @Override
    public List<FinishedProductSubclass> finishedProductSubclass() {
        FinishedProductSubclassExample finishedProductSubclassExample = new FinishedProductSubclassExample();
        return finishedProductSubclassMapper.selectByExample(finishedProductSubclassExample);
    }

    @Override
    public List<FinishedProductDiscern> finishedProductDiscern() {
        FinishedProductDiscernExample finishedProductDiscernExample = new FinishedProductDiscernExample();
        return finishedProductDiscernMapper.selectByExample(finishedProductDiscernExample);
    }

    @Override
    public List<Unit> unit() {
        UnitExample unitExample = new UnitExample();
        return unitMapper.selectByExample(unitExample);
    }

    @Override
    public List<Texture> texture() {
        TextureExample textureExample = new TextureExample();
        return textureMapper.selectByExample(textureExample);
    }

    @Override
    public List<Currency> currency() {
        CurrencyExample currencyExample = new CurrencyExample();
        return currencyMapper.selectByExample(currencyExample);
    }
}
