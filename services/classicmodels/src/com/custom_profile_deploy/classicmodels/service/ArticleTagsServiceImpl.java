/*Copyright (c) 2016-2017 profiles.com All Rights Reserved.
 This software is the confidential and proprietary information of profiles.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with profiles.com*/
package com.custom_profile_deploy.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.commons.MessageResource;
import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.custom_profile_deploy.classicmodels.ArticleTags;
import com.custom_profile_deploy.classicmodels.ArticleTagsId;


/**
 * ServiceImpl object for domain model class ArticleTags.
 *
 * @see ArticleTags
 */
@Service("classicmodels.ArticleTagsService")
@Validated
public class ArticleTagsServiceImpl implements ArticleTagsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleTagsServiceImpl.class);


    @Autowired
    @Qualifier("classicmodels.ArticleTagsDao")
    private WMGenericDao<ArticleTags, ArticleTagsId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ArticleTags, ArticleTagsId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ArticleTags create(ArticleTags articleTags) {
        LOGGER.debug("Creating a new ArticleTags with information: {}", articleTags);

        ArticleTags articleTagsCreated = this.wmGenericDao.create(articleTags);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(articleTagsCreated);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public ArticleTags getById(ArticleTagsId articletagsId) {
        LOGGER.debug("Finding ArticleTags by id: {}", articletagsId);
        return this.wmGenericDao.findById(articletagsId);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public ArticleTags findById(ArticleTagsId articletagsId) {
        LOGGER.debug("Finding ArticleTags by id: {}", articletagsId);
        try {
            return this.wmGenericDao.findById(articletagsId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No ArticleTags found with id: {}", articletagsId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public List<ArticleTags> findByMultipleIds(List<ArticleTagsId> articletagsIds, boolean orderedReturn) {
        LOGGER.debug("Finding ArticleTags by ids: {}", articletagsIds);

        return this.wmGenericDao.findByMultipleIds(articletagsIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
    @Override
    public ArticleTags update(ArticleTags articleTags) {
        LOGGER.debug("Updating ArticleTags with information: {}", articleTags);

        this.wmGenericDao.update(articleTags);
        this.wmGenericDao.refresh(articleTags);

        return articleTags;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ArticleTags delete(ArticleTagsId articletagsId) {
        LOGGER.debug("Deleting ArticleTags with id: {}", articletagsId);
        ArticleTags deleted = this.wmGenericDao.findById(articletagsId);
        if (deleted == null) {
            LOGGER.debug("No ArticleTags found with id: {}", articletagsId);
            throw new EntityNotFoundException(MessageResource.create("com.wavemaker.runtime.entity.not.found"), ArticleTags.class.getSimpleName(), articletagsId);
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public void delete(ArticleTags articleTags) {
        LOGGER.debug("Deleting ArticleTags with {}", articleTags);
        this.wmGenericDao.delete(articleTags);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<ArticleTags> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all ArticleTags");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<ArticleTags> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all ArticleTags");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service classicmodels for table ArticleTags to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service classicmodels for table ArticleTags to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}