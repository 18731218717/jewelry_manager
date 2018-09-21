package org.bdyy.jewelry.service;

import org.bdyy.jewelry.pojo.*;

import java.util.List;

public interface PageLoaderService {
    List<FinishedProductType> finishedProductType();

    List<FinishedProductBroadHeading> finishedProductBroadHeading();

    List<FinishedProductSubclass> finishedProductSubclass();

    List<FinishedProductDiscern> finishedProductDiscern();

    List<Unit> unit();

    List<Texture> texture();

    List<Currency> currency();
}
