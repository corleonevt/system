package com.catering.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.*;
import com.catering.system.entity.*;
import com.catering.system.service.DistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributionServiceImpl implements DistributionService {
    @Autowired
    private DistributionAreaDao areaDao;
    @Autowired
    private DistributionLineDao lineDao;
    @Autowired
    private DistributionGroupDao groupDao;
    @Autowired
    private DistributionTypeDao typeDao;
    @Autowired
    private DistributionDao dao;
    @Autowired
    private MealDao mealDao;
    @Override
    public String addDistributionLine(DistributionLine distributionLine) {
        int rows = lineDao.insert(distributionLine);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public Page<DistributionLine> queryLine(DistributionLine distributionLine) {
        System.out.println("开始 ");
        Page<DistributionLine> page = new Page<>(distributionLine.getPageNo(),distributionLine.getPageSize());
        QueryWrapper<DistributionLine> wrapper = new QueryWrapper<>();
        wrapper.like("line_name",distributionLine.getLineName());
        return lineDao.selectPage(page,wrapper);
    }

    @Override
    public String modifyLine(DistributionLine distributionLine) {
        int rows = lineDao.updateById(distributionLine);
        return rows>0?"修改成功":"修改失败";
    }

    @Override
    public DistributionLine queryDistributionById(DistributionLine distributionLine) {
        return lineDao.selectById(distributionLine.getId());
    }

    @Override
    public String addDistributionArea(DistributionArea distributionArea) {
        int rows = areaDao.insert(distributionArea);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public Page<DistributionArea> queryArea(DistributionArea distributionArea) {
        Page<DistributionArea> page = new Page<>(distributionArea.getPageNo(),distributionArea.getPageSize());
        QueryWrapper<DistributionArea> wrapper = new QueryWrapper<>();
        wrapper.like("area_name",distributionArea.getAreaName());
        return areaDao.selectPage(page,wrapper);
    }

    @Override
    public String modifyArea(DistributionArea distributionArea) {
        int rows = areaDao.updateById(distributionArea);
        return rows>0?"修改成功":"修改失败";
    }

    @Override
    public DistributionArea queryDistributionAreaById(DistributionArea distributionArea) {
        return areaDao.selectById(distributionArea.getId());
    }

    @Override
    public String addDistributionGroup(DistributionGroup distributionGroup) {
        int rows = groupDao.insert(distributionGroup);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public Page<DistributionGroup> queryGroup(DistributionGroup distributionGroup) {
        Page<DistributionGroup> page = new Page<>(distributionGroup.getPageNo(),distributionGroup.getPageSize());
        QueryWrapper<DistributionGroup> wrapper = new QueryWrapper<>();
        wrapper.like("group_name",distributionGroup.getGroupName());
        return groupDao.selectPage(page,wrapper);
    }

    @Override
    public String modifyGroup(DistributionGroup distributionGroup) {
        int rows = groupDao.updateById(distributionGroup);
        return rows>0?"修改成功":"修改失败";
    }

    @Override
    public DistributionGroup queryDistributionGroupById(DistributionGroup distributionGroup) {
        return groupDao.selectById(distributionGroup.getId());
    }

    @Override
    public String addDistributionType(DistributionType distributionType) {
        int rows = typeDao.insert(distributionType);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public Page<DistributionType> queryType(DistributionType distributionType) {
        Page<DistributionType> page = new Page<>(distributionType.getPageNo(),distributionType.getPageSize());
        QueryWrapper<DistributionType> wrapper = new QueryWrapper<>();
        wrapper.like("type_name",distributionType.getTypeName());
        return typeDao.selectPage(page,wrapper);
    }

    @Override
    public String modifyType(DistributionType distributionType) {
        int rows = typeDao.updateById(distributionType);
        return rows>0?"修改成功":"修改失败";
    }

    @Override
    public DistributionType queryDistributionTypeById(DistributionType distributionType) {
        return typeDao.selectById(distributionType.getId());
    }

    @Override
    public Page<Client> queryClient(Client client) {
        Page<Client> page = new Page<>(client.getPageNo(),client.getPageSize());
        return dao.selectAllClient(page,client) ;
    }

    @Override
    public String addClient(Client client) {
        int rows = dao.insert(client);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public String modifyClient(Client client) {
        int rows = dao.updateById(client);
        return rows>0?"修改成功":"修改失败";
    }

    @Override
    public Client querycliientById(Client client) {
        return dao.selectById(client.getId());
    }

    @Override
    public Boolean stopClientDistribution(Client client) {
        Client client1 = dao.selectById(client.getId());
        if (client1.isStopClient()==false){
            client1.setStopClient(true);
            dao.updateById(client1);
            return true;
        }
        client1.setStopClient(false);
        dao.updateById(client1);
        return false;
    }

    @Override
    public Page<MealType> queryMeal(MealType mealType) {
        Page<MealType> page = new Page<>(mealType.getPageNo(),mealType.getPageSize());
        QueryWrapper<MealType> wrapper = new QueryWrapper<>();
        wrapper.like("meal_name",mealType.getMealName());
        return mealDao.selectPage(page,wrapper);
    }

    @Override
    public MealType queryMealById(MealType mealType) {
        return mealDao.selectById(mealType.getId());
    }

    @Override
    public String modifyMeal(MealType mealType) {
        int rows = mealDao.updateById(mealType);
        return rows>0?"修改成功":"修改失败";
    }

    @Override
    public String addMeal(MealType mealType) {
        int rows = mealDao.insert(mealType);
        return rows>0?"新增成功":"新增失败";
    }
}
