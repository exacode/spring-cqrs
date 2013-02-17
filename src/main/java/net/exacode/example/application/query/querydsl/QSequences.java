package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSequences is a Querydsl query type for QSequences
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSequences extends com.mysema.query.sql.RelationalPathBase<QSequences> {

    private static final long serialVersionUID = 1040690958;

    public static final QSequences sequences = new QSequences("sequences");

    public final SimplePath<Object> cycleOption = createSimple("cycle_option", Object.class);

    public final SimplePath<Object> dataType = createSimple("data_type", Object.class);

    public final SimplePath<Object> increment = createSimple("increment", Object.class);

    public final SimplePath<Object> maximumValue = createSimple("maximum_value", Object.class);

    public final SimplePath<Object> minimumValue = createSimple("minimum_value", Object.class);

    public final SimplePath<Object> numericPrecision = createSimple("numeric_precision", Object.class);

    public final SimplePath<Object> numericPrecisionRadix = createSimple("numeric_precision_radix", Object.class);

    public final SimplePath<Object> numericScale = createSimple("numeric_scale", Object.class);

    public final SimplePath<Object> sequenceCatalog = createSimple("sequence_catalog", Object.class);

    public final SimplePath<Object> sequenceName = createSimple("sequence_name", Object.class);

    public final SimplePath<Object> sequenceSchema = createSimple("sequence_schema", Object.class);

    public final SimplePath<Object> startValue = createSimple("start_value", Object.class);

    public QSequences(String variable) {
        super(QSequences.class, forVariable(variable), "information_schema", "sequences");
    }

    @SuppressWarnings("all")
    public QSequences(Path<? extends QSequences> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sequences");
    }

    public QSequences(PathMetadata<?> metadata) {
        super(QSequences.class, metadata, "information_schema", "sequences");
    }

}

