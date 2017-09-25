package com.github.georgealvessilveira.jooq_extension_lib;

import java.math.BigDecimal;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.impl.TableImpl;
import org.jooq.impl.UpdatableRecordImpl;

import javaslang.collection.List;
import javaslang.control.Option;

public class DAO {

    private static DSLContext staticDsl;
    private static TableImpl<?> staticTableImpl;
    private static Class<?> staticClazz;
    private static Field<Integer> fieldId;

    private DAO() {
	// Vazio
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public static <IEntity> DAO newInstance(DSLContext dsl, Class<IEntity> clazz, TableImpl<?> tableImpl) {
	staticDsl = dsl;
	staticClazz = clazz;
	staticTableImpl = tableImpl;
	fieldId = (Field<Integer>) tableImpl.field("id");
	return new DAO();
    }

    @SuppressWarnings({ "hiding" })
    public <IEntity> Integer save(IEntity entidade) {
	UpdatableRecordImpl<?> record = getUpdatableRecord(entidade);
	record.store();
	return record.getValue(fieldId);
    }

    @SuppressWarnings({ "hiding" })
    public <IEntity> boolean update(IEntity entidade) {
	UpdatableRecordImpl<?> record = getUpdatableRecord(entidade);
	return record.update() > 0;
    }

    @SuppressWarnings({ "hiding" })
    public <IEntity> boolean delete(IEntity entidade) {
	UpdatableRecordImpl<?> record = getUpdatableRecord(entidade);
	return record.delete() > 0;
    }
    
    @SuppressWarnings({ "hiding" })
    private <IEntity> UpdatableRecordImpl<?> getUpdatableRecord(IEntity entidade) {
	return (UpdatableRecordImpl<?>) staticDsl.newRecord(staticTableImpl, entidade);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, String value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, Boolean value) {
	Field<Boolean> field = (Field<Boolean>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return (List<IEntity>) selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, Short value) {
	Field<Short> field = (Field<Short>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, Integer value) {
	Field<Integer> field = (Field<Integer>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, Long value) {
	Field<Long> field = (Field<Long>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, Float value) {
	Field<Float> field = (Field<Float>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, Double value) {
	Field<Double> field = (Field<Double>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listBy(String param, BigDecimal value) {
	Field<BigDecimal> field = (Field<BigDecimal>) staticTableImpl.field(param);
	Condition condition = field.eq(value);
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, String value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, Boolean value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, Short value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, Integer value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, Long value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, Float value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, Double value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> List<IEntity> listByLike(String param, BigDecimal value) {
	Field<String> field = (Field<String>) staticTableImpl.field(param);
	Condition condition = field.like("%" + value + "%");
	return selectWhereEq(condition);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <IEntity> List<IEntity> selectWhereEq(Condition condition) {
	return (List<IEntity>) staticDsl.select()
					 .from(staticTableImpl)
					 .where(condition)
					 .fetchInto(staticClazz);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    public <IEntity> Option<IEntity> getById(int id) {
	Condition condition = fieldId.eq(id);
	IEntity value = (IEntity) staticDsl.select()
					     .from(staticTableImpl)
					     .where(condition)
					     .fetchOneInto(staticClazz);
	return Option.of(value);
    }
}
