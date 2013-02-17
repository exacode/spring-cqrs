package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QColumnPrivileges is a Querydsl query type for QColumnPrivileges
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QColumnPrivileges extends com.mysema.query.sql.RelationalPathBase<QColumnPrivileges> {

    private static final long serialVersionUID = -2006289892;

    public static final QColumnPrivileges columnPrivileges = new QColumnPrivileges("column_privileges");

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> grantor = createSimple("grantor", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> privilegeType = createSimple("privilege_type", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QColumnPrivileges(String variable) {
        super(QColumnPrivileges.class, forVariable(variable), "information_schema", "column_privileges");
    }

    @SuppressWarnings("all")
    public QColumnPrivileges(Path<? extends QColumnPrivileges> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "column_privileges");
    }

    public QColumnPrivileges(PathMetadata<?> metadata) {
        super(QColumnPrivileges.class, metadata, "information_schema", "column_privileges");
    }

}

