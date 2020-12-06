package com.solvd.citiesProject.dao.mybatis;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IPointDAO;
import com.solvd.citiesProject.models.Point;

public class PointDAO implements IPointDAO {
	private static final Logger LOGGER = LogManager.getLogger(PointDAO.class);
	@Override
	public Point save(Point e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Point> getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Point> getAll() {
		List<Point> pointList = null;
		try {
			pointList = MyBatisUtils.getInstance().getSession().openSession().getMapper(IPointDAO.class).getAll();
		} catch (IOException e) {
			LOGGER.error(e);
		}
		return pointList;
	}

}
