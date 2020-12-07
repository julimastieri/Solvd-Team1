package com.solvd.citiesProject.dao.mybatis;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IPathDAO;
import com.solvd.citiesProject.dao.IPointDAO;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;

public class PathDAO implements IPathDAO {
	private static final Logger LOGGER = LogManager.getLogger(PathDAO.class);
	@Override
	public Path save(Path e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Path> getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Path> getAll() {
		List<Path> pathList = null;
		try {
			pathList = MyBatisUtils.getInstance().getSession().openSession().getMapper(IPathDAO.class).getAll();
		} catch (IOException e) {
			LOGGER.error(e);
		}
		return pathList;
	}

}
