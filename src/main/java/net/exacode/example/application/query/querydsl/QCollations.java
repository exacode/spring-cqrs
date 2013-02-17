package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCollations is a Querydsl query type for QCollations
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCollations extends com.mysema.query.sql.RelationalPathBase<QCollations> {

    private static final long serialVersionUID = 520719182;

    public static final QCollations collations = new QCollations("collations");

    public final SimplePath<Object> collationCatalog = createSimple("collation_catalog", Object.class);

    public final SimplePath<Object> collationName = createSimple("collation_name", Object.class);

    public final SimplePath<Object> collationSchema = createSimple("collation_schema", Object.class);

    public final SimplePath<Object> padAttribute = createSimple("pad_attribute", Object.class);

    public QCollations(String variable) {
        super(QCollations.class, forVariable(variable), "information_schema", "collations");
    }

    @SuppressWarnings("all")
    public QCollations(Path<? extends QCollations> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "collations");
    }

    public QCollations(PathMetadata<?> metadata) {
        super(QCollations.class, metadata, "information_schema", "collations");
    }

}

